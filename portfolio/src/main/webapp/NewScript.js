/** Fetches the current date from the server and adds it to the page. */
async function addRandomQuote() {
    const responseFromServer = await fetch('/hello');
    const quotes = await responseFromServer.json();
    
    const quoteContainer = document.getElementById('quote-container');
    
        const randNum = Math.floor((Math.random()* 3) +1);
        if (randNum == 1){
            quoteContainer.innerText = 'Quote 1: Live And Let Live';
        }
        else if (randNum == 2){
            quoteContainer.innerText = 'Quote 2: All Fingers Are Not Equal';
            
        }
        else if (randNum == 3){
            quoteContainer.innerText = 'Quote 3: Another Man\'s Food Is Another Man\'s Poison';
        }


}
