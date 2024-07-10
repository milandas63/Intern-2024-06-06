import express from 'express';
import bodyParser from 'body-parser';
import fs from 'fs';
import path from 'path';
import { fileURLToPath } from 'url';

const __dirname = path.dirname(fileURLToPath(import.meta.url));

const app = express();
const PORT = 3000;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));
app.set('view engine', 'ejs');

const workoutsFilePath = path.join(__dirname, 'data', 'workouts.json');

let workouts = JSON.parse(fs.readFileSync(workoutsFilePath, 'utf8'));

app.get('/', (req, res) => {
    res.render('index');
});

app.get('/:day', (req, res) => {
    const day = req.params.day.toLowerCase();
    const validDays = ['monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday', 'sunday'];
    if (validDays.includes(day)) {
        res.render('day', { day: day, data: workouts[day] || { rest: false, exercises: [] } });
    } else {
        res.status(404).send('Day not found');
    }
});

app.post('/save-day', (req, res) => {
    const { day, rest, exercise } = req.body;
    if (rest === 'true') {
        workouts[day] = { rest: true, exercises: [] };
    } else {
        if (!workouts[day]) {
            workouts[day] = { rest: false, exercises: [] };
        }
        workouts[day].exercises.push(exercise);
    }

    fs.writeFileSync(workoutsFilePath, JSON.stringify(workouts, null, 2), 'utf8');
    res.redirect(`/${day}`);
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
