
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Freizeitplanungs-Calculator</title>
    <link rel="stylesheet"  href="style3.css">

</head>

<body>

<div class="container">
    <div class="navbar">
        <div class="logo">
            <a href="#">Freizeitplanung-Calculator</a>
        </div>
    </div>


    <form action="add" method="post">

        <div>
            <select name="type" class="dropdown" id="activity" >
                <option name="type" value="" disabled selected>Select your option</option>
                <option name="type" value="Relax">Relax</option>
                <option name="type" value="Sport">Sport</option>
                <option name="type" value="Entertainment">Entertainment</option>
            </select>

        </div>
        <div>
            <select name="weather" class="dropdown" id="wetter">
                <option name="weather" value="" disabled selected>Select your option</option>
                <option name="weather" value="Sonne">Sonne</option>
                <option name="weather" value="Regen">Regen</option>
                <option name="weather" value="Schnee">Schnee</option>
            </select>
        </div>

        <div>
            <input type="text" name="cost" class="dropdown" id="kosten"  placeholder="Bitte maximale Kosten eingeben">
        </div>

        <div>
            <input type="submit" class="sub_btn" id="submitButton" value="Was mach ich nur?"/>
        </div>
    </form>


    </div>
</div>