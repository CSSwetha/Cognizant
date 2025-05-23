
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
