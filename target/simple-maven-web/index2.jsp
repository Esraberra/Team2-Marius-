<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Freizeitplanung-Calculator</title>
        <link rel="stylesheet" href="style.css">

    </head>

    <body>
        <div class="container">
            <div class="navbar">
                <div class="logo">
                    <a href="#">Freizeitplanung-Calculator</a>
                </div>
            </div>

            <div class="img">
                <img src="banner.jpg" alt="Logo" width="400">
            </div>
            <div class="navbar1">





             <ul>



            <li>
                <select class="checkbox" id="type" name="checkboxActivity">
                    <option value="relax">Relax</option>
                    <option value="entertainment">Entertainment</option>
                    <option value="sport">Sport</option>
                </select>
                <input type="submit">
            </li>



           <li>  <select class="checkbox" id="wetter">
                <option value="sw">sonnig warm</option>
                <option value="sk">sonnig kalt</option>
                <option value="rw">regnerisch warm</option>
                <option value="rw">regnerisch kalt</option>
            </select>
            </li>
            <li>


            <select class="checkbox" id="kosten">
                <option value="to10">0 - 10 Euro</option>
                <option value="to20">10 - 20 Euro</option>
                <option value="to50">20 - 50 Euro</option>
                <option value="50plus">50+ Euro</option>
            </select>
            </li>


                    <li>  <button id="btn" class="active">Calculate</button>   </li>
                </ul>

           <form action="add" method="post">
           <div align="center">
               <select name="Weather" id="formaction" size="5">
                  <option value="Sonne">Sonne</option>
                  <option value="Regen">Regen</option>
                  <option value="Schnee">Schnee</option>
               </select>
               </div>
               <input type="submit" value="Call a Servlet2">
           </form>
        <div>
            <br/><br/>

            The weather: ${param.wetter}
        </div>


            </div>
        </div>

    </body>


</html>