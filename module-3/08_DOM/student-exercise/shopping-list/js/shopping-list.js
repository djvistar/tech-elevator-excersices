// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
let groceries = ['Water', 'Bread', 'Cereal', 'Milk', 'Sugar', 'Salt', 'Rice', 'Apples', 'Oranges', 'Flour'];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;

}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const grocerylist = document.getElementById('groceries');

  for (let i = 0; i < groceries.length; i++) {
    const addGrocery = document.createElement('li');
    addGrocery.innerText = groceries[i];
    grocerylist.insertAdjacentElement('beforeend', addGrocery);
  }

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {

  const addGrocery = document.querySelectorAll('li');

  addGrocery.forEach(element => { 
    element.classList.add('completed');
  });

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
