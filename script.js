
function validatePhone(event) {
  const phone = event.target.value;
  if (!/^\d{10}$/.test(phone)) {
    alert("Phone number must be 10 digits.");
  }
}

function showFee(event) {
  const value = event.target.value;
  const fees = { Workshop: "$10", Seminar: "Free", Concert: "$20" };
  alert("Event fee: " + (fees[value] || "N/A"));
  localStorage.setItem("preferredEvent", value);
}

function confirmSubmit() {
  document.getElementById("formOutput").value = "Registration successful!";
}

function handleRegistration(event) {
  event.preventDefault();
  confirmSubmit();
}

function enlargeImage(img) {
  img.style.width = "300px";
}

function videoReady() {
  document.getElementById("videoMsg").textContent = "Video ready to play.";
}


function findLocation() {
  if (!navigator.geolocation) {
    document.getElementById("geoOutput").textContent = "Geolocation not supported.";
    return;
  }
  navigator.geolocation.getCurrentPosition(
    pos => {
      document.getElementById("geoOutput").textContent =
        `Latitude: ${pos.coords.latitude}, Longitude: ${pos.coords.longitude}`;
    },
    () => {
      document.getElementById("geoOutput").textContent = "Unable to retrieve location.";
    },
    { enableHighAccuracy: true }
  );
}
// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
function pageLoaded() {
  alert("Page fully loaded");
}

// 2. Syntax, Data Types, and Operators
const eventName = "Workshop on Baking";
const eventDate = "2025-06-10";
let seats = 20;
let eventInfo = `${eventName} is scheduled for ${eventDate} with ${seats} seats.`;

// 3. Conditionals, Loops, and Error Handling
let events = [
  { name: "Music Fest", category: "music", date: "2025-07-01", seats: 5 },
  { name: "Workshop on Baking", category: "workshop", date: "2025-06-10", seats: 0 },
  { name: "Tech Meetup", category: "tech", date: "2025-05-01", seats: 10 }
];

function displayEvents() {
  const container = document.querySelector("#eventsContainer");
  container.innerHTML = "";
  const today = new Date().toISOString().split('T')[0];

  events.forEach(event => {
    if (event.date > today && event.seats > 0) {
      const card = document.createElement("div");
      card.textContent = `${event.name} - ${event.category} - ${event.date}`;
      const btn = document.createElement("button");
      btn.textContent = "Register";
      btn.onclick = () => {
        try {
          registerUser(event.name);
        } catch (e) {
          alert("Registration error: " + e.message);
        }
      };
      card.appendChild(btn);
      container.appendChild(card);
    }
  });

  populateDropdown();
}

// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(event) {
  events.push(event);
}

function registerUser(eventName) {
  const event = events.find(e => e.name === eventName);
  if (event && event.seats > 0) {
    event.seats--;
    displayEvents();
  } else {
    throw new Error("Event is full or not found.");
  }
}

function filterEventsByCategory(category) {
  return events.filter(e => e.category === category);
}

function registrationTracker(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`${count} users registered in ${category}`);
  };
}

function searchEvents(callback) {
  return events.filter(callback);
}

// 5. Objects and Prototypes
function Event(name, category, date, seats) {
  this.name = name;
  this.category = category;
  this.date = date;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const testEvent = new Event("Yoga Class", "health", "2025-07-10", 15);
console.log(Object.entries(testEvent));

// 6. Arrays and Methods
events.push(new Event("Dance Night", "music", "2025-06-20", 20));
let musicEvents = events.filter(e => e.category === "music");
let formatted = events.map(e => `Event: ${e.name}`);

// 7. DOM Manipulation
function populateDropdown() {
  const dropdown = document.querySelector("#eventDropdown");
  dropdown.innerHTML = "";
  events.forEach(event => {
    const opt = document.createElement("option");
    opt.value = event.name;
    opt.textContent = event.name;
    dropdown.appendChild(opt);
  });
}

// 8. Event Handling
document.getElementById("categoryFilter").onchange = function () {
  let category = this.value;
  let filtered = category ? filterEventsByCategory(category) : events;
  events = filtered;
  displayEvents();
};

document.getElementById("searchInput").addEventListener("keydown", function (e) {
  if (e.key === "Enter") {
    const keyword = this.value.toLowerCase();
    let filtered = events.filter(e => e.name.toLowerCase().includes(keyword));
    events = filtered;
    displayEvents();
  }
});

// 9. Async JS, Promises, Async/Await
function fetchEventsMock() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve([
        { name: "Community Cleanup", category: "volunteer", date: "2025-08-01", seats: 25 }
      ]);
    }, 1000);
  });
}

async function loadRemoteEvents() {
  document.querySelector("#eventsContainer").textContent = "Loading...";
  try {
    let result = await fetchEventsMock();
    events.push(...result);
    displayEvents();
  } catch (e) {
    alert("Failed to load remote events.");
  }
}
loadRemoteEvents();

// 10. Modern JS Features
function greetUser(name = "Guest") {
  console.log(`Hello, ${name}`);
}

const [firstEvent, ...otherEvents] = events;
const clonedEvents = [...events];

// 11. Working with Forms
document.getElementById("registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  const selectedEvent = this.elements["event"].value;

  if (!name || !email || !selectedEvent) {
    alert("Please fill out all fields.");
    return;
  }

  registerUser(selectedEvent);
  alert("Registered successfully!");
});

// 12. AJAX & Fetch API
function postRegistration(data) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ success: true });
    }, 1500);
  });
}

async function submitRegistrationForm(data) {
  try {
    let response = await postRegistration(data);
    if (response.success) {
      alert("Registration submitted!");
    } else {
      alert("Submission failed.");
    }
  } catch (e) {
    alert("Error submitting registration.");
  }
}

// 13. Debugging and Testing
function debugFormSubmission() {
  console.log("Submitting form...");
  console.log("Events:", events);
  // Use Dev Tools to add breakpoints here
}

// 14. jQuery and JS Frameworks
$("#registrationForm").on("submit", function () {
  $("#eventsContainer div").fadeOut().fadeIn();
});

$("#registerBtn").click(() => alert("Clicked register button")); // example use
// Advantage of frameworks: React offers reusable components and virtual DOM for faster UI updates.

displayEvents();