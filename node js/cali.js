let display = document.getElementById("display");

function appendvalue(value) {
    if (value === "=") {
        calculate();
    } else if (value === "+/-") {
        toggleSign();
    } else {
        display.value += value;
    }
}

function clearDisplay() {
    display.value = "";
}

function Del() {
    display.value = display.value.slice(0, -1);
}

function calculate() {
    try {
        display.value = eval(display.value);
    } catch (error) {
        display.value = "Error";
    }
}

function toggleSign() {
    if (display.value !== "") {
        if (display.value.startsWith("-")) {
            display.value = display.value.substring(1);
        } else {
            display.value = "-" + display.value;
        }
    }
}