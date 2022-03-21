<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Freizeitplanung</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <!--<canvas class="webgl"></canvas>-->

    <div class = "cont"> </div>

    <div class="button">
        <button id="btn" >Calculate</button>

        <select class="checkbox" id="type">
            <option value="relax">Relax</option>
            <option value="entertainment">Entertainment</option>
            <option value="sport">Sport</option>
        </select>

        <select class="checkbox" id="wetter">
            <option value="sw">sonnig warm</option>
            <option value="sk">sonnig kalt</option>
            <option value="rw">regnerisch warm</option>
            <option value="rw">regnerisch kalt</option>
        </select>

        <select class="checkbox" id="kosten">
            <option value="to10">0 - 10 Euro</option>
            <option value="to20">10 - 20 Euro</option>
            <option value="to50">20 - 50 Euro</option>
            <option value="50plus">50+ Euro</option>
        </select>
    </div>

</body>
</html>