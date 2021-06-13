/** Fetches the current date from the server and adds it to the page. */
async function addRandomGreeting() {
  const greetings = await fetch('/hello');
  const greeting = await greetings.text();

  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
