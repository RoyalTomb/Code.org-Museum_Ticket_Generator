// Create Variables
var day;
var age;
var discountCode;
var price;




onEvent("calculateButton", "click", function() {
  // Update Variables
  day = getText("dayDropdown");
  age = getText("ageDropdown");
  discountCode = getText("discountInput");
  price = 10;

  
  // Check the value of variables to decide the price to set
  if (discountCode == "FREEFRIDAY" && day == "Friday") {
    price = 0;
  } else if ((age <= 18 && day != "Saturday" && day != "Sunday")) {
    price = 5;
  }

  
  // Create the text for the ticket
  var output = ("Day: " + day ) + "\nAge: " + age + "\nPrice: $" + price;
  setText("ticketOutput", output);

  
  // Set the text on the screen

});
