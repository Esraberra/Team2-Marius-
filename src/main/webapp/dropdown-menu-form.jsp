<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Freizeitplanungs-Calculator</title>
    <link rel="stylesheet"  href="style1.css">

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
                <option name="type" value="Relax">Releax</option>
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
            <input type="submit" class="sub_btn" id="submitButton" value="Zeige Aktivität"/>
        </div>
    </form>
    <div>
        <span>
            <%=request.getParameter("results.calc")%>
        </span>
    </div>
    <div>
        <p>hjskdhfjsdhfjksdahfjkdhsfjhsadfj</p>
    </div>

    <div class="img">
        <img src="banner.jpg" alt="Logo" width="400">
    </div>
    <div class="navbar1">

    </div>
</div>