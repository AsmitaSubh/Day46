<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;600&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="payroll_form_style.css" />
    <link rel="icon" sizes="180x180" href="/CURD_Operation_EmpPayrollapp/assets/icons/69816206.jpg">
    <title>Employee Payroll Form</title>
    <script defer src="payroll_form_script.js"></script>
  </head>

  <body>
    <header class="headerContainer header">
      <div class="logoContainer">
        <img src="IMAGES/logo.jpg" alt="" />
        <div>
          <span class="emp-text">EMPLOYEE</span><br />
          <span class="emp-text emp-payroll">PAYROLL</span>
        </div>
      </div>
    </header>
    <div class="form-content">
      <form class="form" action="#" onsubmit="save()" onreset="resetForm()">
        <div class="form-head">Employee Payroll form</div>
        <div class="row-content">
          <label class="label text" for="name">Name</label>
          <input
            class="input"
            type="text"
            id="name"
            name="name"
            placeholder="Your name.."
            required
          />
          <valid-message class="valid-name" for="name"></valid-message>
          <error-output class="name-error" for="name"></error-output>
        </div>
        <div class="row-content">
          <label class="label text" for="profile">Profile Image</label>
          <div class="profile-radio-content">
            <label>
              <input
                type="radio"
                id="profile1"
                name="profile"
                value="IMAGES/Ellipse -3.png"
                required
              />
              <img
                class="profile"
                id="image1"
                src="IMAGES/Ellipse -3.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile2"
                name="profile"
                value="IMAGES/Ellipse -4.png"
                required
              />
              <img
                class="profile"
                id="image2"
                src="IMAGES/Ellipse -4.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile3"
                name="profile"
                value="IMAGES/Ellipse -5.png"
                required
              />
              <img
                class="profile"
                id="image3"
                src="IMAGES/Ellipse -5.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile4"
                name="profile"
                value="IMAGES/Ellipse -7.png"
                required
              />
              <img
                class="profile"
                id="image4"
                src="IMAGES/Ellipse -7.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile5"
                name="profile"
                value="IMAGES/Ellipse -2.png"
                required
              />
              <img
                class="profile"
                id="image5"
                src="IMAGES/Ellipse -2.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile6"
                name="profile"
                value="IMAGES/Ellipse -1.png"
                required
              />
              <img
                class="profile"
                id="image6"
                src="IMAGES/Ellipse -1.png"
              />
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="gender">Gender</label>
          <div>
            <label>
              <input
                type="radio"
                id="male"
                name="gender"
                value="male"
                required
              />
              <label class="text" for="male">Male</label>
            </label>
            <label>
              <input
                type="radio"
                id="female"
                name="gender"
                value="female"
                required
              />
              <label class="text" for="female">Female</label>
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="department">Department</label>
          <div>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="hr"
                name="department"
                value="HR"
              />
              <label class="text" for="hr">HR</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="sales"
                name="department"
                value="Sales"
              />
              <label class="text" for="sales">Sales</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="finance"
                name="department"
                value="Finance"
              />
              <label class="text" for="finance">Finance</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="engineer"
                name="department"
                value="Engineer"
              />
              <label class="text" for="engineer">Engineer</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="others"
                name="department"
                value="Others"
              />
              <label class="text" for="others">Others</label>
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="salary">Choose your Salary: </label>
          <input
            class="input"
            type="range"
            name="salary"
            id="salary"
            min="300000"
            max="500000"
            step="100"
            value="400000"
          />
          <output class="salary-output text" for="salary">400000</output>
        </div>
        <div class="row-content">
          <label class="label text" for="startDate">Start Date</label>
          <div name="startdate" id="startDate">
            <select id="day" name="Day">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
              <option value="31">31</option>
            </select>
            <select id="month" name="Month">
              <option value="Jan">January</option>
              <option value="Feb">February</option>
              <option value="Mar">March</option>
              <option value="Apr">April</option>
              <option value="May">May</option>
              <option value="June">June</option>
              <option value="July">July</option>
              <option value="Aug">August</option>
              <option value="Sep">September</option>
              <option value="Oct">October</option>
              <option value="Nov">November</option>
              <option value="Dec">December</option>
            </select>
            <select id="year" name="Year">
              <option value="2020">2020</option>
              <option value="2019">2019</option>
              <option value="2018">2018</option>
              <option value="2017">2017</option>
              <option value="2016">2016</option>
            </select>
          </div>
          <valid-message
            class="valid-startDate"
            for="startDate"
          ></valid-message>
          <error-output class="startDate-error" for="startDate"></error-output>
        </div>
        <div class="row-content">
          <label class="label text" for="notes">Notes</label>
          <textarea
            class="input"
            id="notes"
            name="Notes"
            placeholder="Write a note..."
            style="height: 100px"
          ></textarea>
        </div>
        <div class="buttonParent">
          <a href="home.html" class="resetButton button cancelButton"
            >Home</a
          >
          <div class="submit-reset">
            <button class="button submitButton" type="submit" id="submitButton">
              Submit
            </button>
            <button class="resetButton button" type="reset">Reset</button>
          </div>
        </div>
      </form>
    </div>
  </body>
</html>




<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="home_page_style.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,600;1,500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;600&display=swap" rel="stylesheet">
    <title>Home Page</title>
    <link rel="icon" sizes="180x180" href="/CURD_Operation_EmpPayrollapp/assets/icons/69816206.jpg">
</head>

<body>
    <header class="header-content header">
        <div class="logo-content">
            <img src="IMAGES/logo.jpg" alt="">
            <div>
                <span class="emp-text">EMPLOYEE</span></br>
                <span class="emp-text emp-payroll">PAYROLL</span>
            </div>
        </div>
    </header>
    <div class="main-content">
        <div class="header-content">
            <div class="heading">
                Employee Details
                <div class="emp-count">
                    10
                </div>
            </div>
            <a href="..//pages/employee_payroll_form.html" class="add-button">
                <img src="..//assets/icons/add-24px.svg" alt="">Add User</a>
        </div>
        <div class="table-main">
            <table id="display" class="table">
            </table>
        </div>
    </div>
    <script src="employee_home_script.js"></script>
    <script src="utility_script.js"></script>
    <script src="site_properties_script.js"></script>
    <script src="payroll_form_script.js"></script>
</body>

</html>






body {
    margin: 0;
    height: 100%;
}

.header {
    padding: 15px 0;
    background-color: #ffffff;
}

.headerContainer {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    border: 0px solid green;
}

.logoContainer {
    display: flex;
    flex-direction: row;
    align-items: center;
    border: 0px solid green;
    width: 80%;
}

.logoContainer-img {
    border: solid 0px #42515f;
}

.emp-text {
    font: normal normal bold 20px/25px Montserrat;
    font-family: "Montserrat", sans-serif;
    letter-spacing: 0px;
    color: #82a70c;
    text-transform: capitalize;
}

.emp-payroll {
    color: #42515f;
}

* {
    box-sizing: border-box;
}

.form-content {
    min-height: calc(100% - 80px);
    background-color: #f7f7f7;
    display: flex;
    justify-content: center;
    align-items: center;
    border: 0px solid green;
}

.form {
    width: 65%;
    padding: 44px 60px;
    background: #ffffff 0% 0% no-repeat padding-box;
    box-shadow: 0px 3px 6px #00000029;
    border: 1px solid #f5f5f5;
    border-radius: 8px;
    opacity: 1;
}

.form-head {
    font: normal normal bold 24px/37px Roboto;
    letter-spacing: 0px;
    color: #42515f;
    text-transform: capitalize;
    opacity: 1;
    padding: 20px;
}

.row-content {
    display: flex;
    flex-direction: row;
    margin-bottom: 10px;
    align-items: center;
    border: 0px solid green;
}

.label {
    min-width: 140px;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

.text {
    font-size: 16px;
    color: #42515f;
    opacity: 1;
    font-family: Roboto;
}

.input {
    font-family: Roboto;
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}

.profile-radio-content {
    display: flex;
    flex-direction: row;
}

.profile-radio-content>label {
    display: flex;
    flex-direction: row;
    align-items: center;
}

.profile {
    width: 40px;
    border-radius: 50%;
    margin-left: 12px;
}

select {
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
    font: normal normal normal 16px Roboto;
    letter-spacing: 0px;
    color: #42515f;
    background-color: transparent;
}

.buttonParent {
    display: flex;
    margin-top: 10px;
    justify-content: space-between;
    margin-top: 20px;
}

.button {
    font-size: 20px;
    font-family: Roboto;
    letter-spacing: 0px;
    color: #42515f;
    opacity: 1;
    background: #f5f5f5;
    border: 1px solid #707070;
    font-weight: 400;
    min-width: 140px;
    padding: 7px 7px;
    cursor: pointer;
    border-radius: 4px;
}

.submitButton {
    margin-right: 30px;
}

.submitButton:hover {
    background: #39ac1ad7;
    color: #faf9f9e3;
    font-weight: 300;
    border: 2px solid #2bd625;
}

.resetButton:hover {
    background: #0000008e;
    color: #faf9f9e3;
    font-weight: 300;
    border: 2px solid #e4e4e4;
}

.cancelButton {
    text-decoration: none;
    text-align: center;
}

.cancelButton:hover {
    background: #b62c25;
    color: #faf9f9e3;
    font-weight: 300;
    border: 2px solid #ff3737;
}

error-output {
    margin-left: 2px;
    font-size: 14px;
    font-style: italic;
    color: red;
}

valid-message {
    font-size: 14px;
    color: green;
    margin-left: 4px;
    font-weight: bold;
}

@media only screen and (max-width: 960px) and (min-width: 600px) {
    .cancelButton {
        margin-left: 0px;
    }
    .form {
        width: 85%;
        padding: 44px 20px;
    }
}

@media only screen and (max-width: 600px) {
    .form {
        margin-top: 10px;
    }
    .row-content {
        flex-direction: column;
        align-items: center;
    }
    .profile-radio-content {
        flex-flow: wrap;
    }
    .submit-reset {
        width: 100%;
        display: flex;
        flex-grow: 1;
        flex-flow: wrap;
        flex-direction: row-reverse;
        justify-content: space-between;
        margin-bottom: 20px;
    }
    .submitButton {
        margin: 0;
    }
    .buttonParent {
        flex-direction: column-reverse;
        align-items: flex-end;
    }
}






html body {
    margin: 0;
    height: 100%;
}

.header {
    padding: 15px 0;
    background-color: #ffffff;
}

.header-content {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    border: 0px solid green;
}

.logo-content {
    display: flex;
    flex-direction: row;
    align-items: center;
    border: 0px solid green;
    width: 80%;
}

.logo-content-img {
    border: solid 0px #42515F;
}

.emp-text {
    font: normal normal bold 20px/25px Montserrat;
    font-family: "Montserrat", sans-serif;
    letter-spacing: 0px;
    color: #82a70c;
    text-transform: capitalize;
}

.emp-payroll {
    color: #42515f;
}

* {
    box-sizing: border-box;
}

.main-content {
    display: flex;
    flex-direction: column;
    min-height: calc(100vh - 80px);
    background-color: #f7f7f7;
    padding: 30px 0 10px;
    box-sizing: border-box;
}

.header-content {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    width: 80%;
    margin: 0 auto;
    padding: 25px;
}

.heading {
    font: normal normal bold 24px/25px Roboto;
    letter-spacing: 0px;
    color: #42515f;
    opacity: 1;
}

.emp-count {
    background-color: #82a70c;
    color: #ffffff;
    border-radius: 42%;
    font-size: 16px;
    width: 26px;
    text-align: center;
    display: inline-block;
}

.add-button {
    font: normal normal normal 22px/29px Roboto;
    color: #ffffff;
    letter-spacing: 0px;
    opacity: 1;
    background: #82a70c 0% 0% no-repeat padding-box;
    border: none;
    border-radius: 5px;
    padding: 5px 18px;
    outline: none;
    cursor: pointer;
    text-decoration: none;
}

.table-main {
    width: 80%;
    margin: 0 auto;
    overflow: auto;
}

.table {
    width: 100%;
    border-collapse: separate;
    border-spacing: 0 15px;
    min-width: 800px;
}

td,
th {
    text-align: left;
    padding: 5px 8px;
}

th {
    background: #42515F 0% 0% no-repeat padding-box;
    border-radius: 0px;
    opacity: 1;
    text-align: left;
    font: normal normal normal 14px/24px Roboto;
    color: #ffffff;
    letter-spacing: 0px;
    text-transform: uppercase;
    border: 0px solid #dddddd;
    padding: 8px;
}

tr:not(:first-child) {
    background: #ffffff 0% 0% no-repeat padding-box;
    border: 1px solid #e3e3e3;
    border-radius: 3px;
}

td {
    font: normal normal normal 14px/21px Roboto;
    letter-spacing: 0px;
    color: #3d3d3d;
    opacity: 1;
}

td:first-child {
    display: flex;
    align-items: center;
}

td img:first-child {
    margin-right: 10px;
}

td img {
    cursor: pointer;
}

.dept-label {
    background-color: #e9fea5;
    border-radius: 40%;
    width: fit-content;
    padding: 1px 7px;
    text-align: center;
    font-size: 14px;
    display: inline-block;
    font-weight: 300;
    margin-bottom: 8px;
}





let employeePayrollList;
window.addEventListener("DOMContentLoaded", () => {
    employeePayrollList = getEmployeePayrollDataFromStorage();
    document.querySelector(".emp-count").textContent = employeePayrollList.length;
    createInnerHtml();
});

const getEmployeePayrollDataFromStorage = () => {
    return localStorage.getItem("EmployeePayrollList") ?
        JSON.parse(localStorage.getItem("EmployeePayrollList")) : [];
};

const createInnerHtml = () => {
    const headerHtml =
        "<th></th>" +
        "<th>Name</th>" +
        "<th>Gender</th>" +
        "<th>Department</th>" +
        "<th>Salary</th>" +
        "<th>Start Date</th>" +
        "<th>Actions</th>";
    let innerHtml = `${headerHtml}`;
    if (employeePayrollList.length == 0) {
        return;
    }
    for (let employeePayrollData of employeePayrollList) {
        innerHtml = `${innerHtml}
        <tr>
            <td><img class="profile" alt="" src="${employeePayrollData._profilePicture}"></td>
            <td>${employeePayrollData._name}</td>
            <td>${employeePayrollData._gender}</td>
            <td>${getDepartmentHtml(employeePayrollData._departments)}</td>
            <td>${employeePayrollData._salary}</td>
            <td>${stringifyDate(employeePayrollData._startDate)}</td>
            <td>
                <img id="${employeePayrollData._id}" onclick="remove(this)" alt="delete" src="..//assets/icons/delete-black-18dp.svg">
                <img id="${employeePayrollData._id}" onclick="update(this)" alt="edit" src="..//assets/icons/create-black-18dp.svg">
            </td>
        </tr>
        `;
    }
    document.querySelector("#display").innerHTML = innerHtml;
};

const getDepartmentHtml = (departmentList) => {
    let departmentHtml = "";
    for (let department of departmentList) {
        departmentHtml = `${departmentHtml} <div class="dept-label">${department}</div>`;
    }
    return departmentHtml;
};

const remove = (node) => {
    let employeePayrollData = employeePayrollList.find(employeeData => employeeData._id == node.id);
    if (!employeePayrollData) return;
    const index = employeePayrollList.map(employeeData => employeeData._id).indexOf(employeePayrollData._id);
    employeePayrollList.splice(index, 1);
    localStorage.setItem("EmployeePayrollList", JSON.stringify(employeePayrollList));
    document.querySelector(".emp-count").textContent = employeePayrollList.length;
    createInnerHtml();
};






class EmployeePayrollData {

    get id() {
        return this._id;
    }
    set id(id) {
        this._id = id;
    }

    get name() {
        return this._name;
    }
    set name(name) {
        const NAME_REGEX = RegExp("^[A-Z]{1}[a-zA-Z\\s]{2,}$");
        if (NAME_REGEX.test(name)) {
            this._name = name;
        } else throw "Name is Incorrect!";
    }

    get gender() {
        return this._gender;
    }
    set gender(gender) {
        this._gender = gender;
    }

    get profilePicture() {
        return this._profilePicture;
    }
    set profilePicture(profilePicture) {
        this._profilePicture = profilePicture;
    }

    get salary() {
        return this._salary;
    }
    set salary(salary) {
        this._salary = salary;
    }

    get startDate() {
        return this._startDate;
    }
    set startDate(startDate) {
        if (startDate <= new Date()) {
            this._startDate = startDate;
        } else throw "Start Date is Incorrect!";
    }

    get departments() {
        return this._departments;
    }
    set departments(departments) {
        if (departments.length != 0) {
            this._departments = departments;
        } else throw "No Department Entered!";
    }

    get note() {
        return this._note;
    }
    set note(note) {
        this._note = note;
    }

    toString() {
        const options = { year: 'numeric', month: 'long', day: 'numeric' };
        const employeeDate = !this.startDate ? "undefined" :
            this.startDate.toLocaleDateString("en-US", options);
        return "[ id: " + this.id + ", name: " + this.name + ", gender: " + this.gender + ", profilePicture: " + this._profilePicture +
            ", salary: " + this.salary + ", startDate: " + employeeDate + ", departments: " + this.departments + ", note: " + this._note + " ]" + "\n";
    }
}

window.addEventListener("DOMContentLoaded", () => {

    const name = document.querySelector("#name");
    const nameError = document.querySelector(".name-error");
    const validName = document.querySelector(".valid-name");
    if (name) {
        name.addEventListener("input", function() {
            if (name.value.length == 0) {
                nameError.textContent = "";
                validName.textContent = "";
            } else {
                try {
                    (new EmployeePayrollData).name = name.value;
                    nameError.textContent = "";
                    validName.textContent = '✓';
                    document.querySelector(".submitButton").disabled = false;
                } catch (error) {
                    nameError.textContent = error;
                    validName.textContent = "";
                    document.querySelector(".submitButton").disabled = true;
                }
            }
        });
    }


    const startDate = document.querySelector("#startDate");
    const startDateError = document.querySelector(".startDate-error");
    const validStartDate = document.querySelector(".valid-startDate");
    if (startDate) {
        startDate.addEventListener("input", function() {
            try {
                let dateString = document.querySelector("#month").value + " " + document.querySelector("#day").value + ", " + document.querySelector("#year").value;
                (new EmployeePayrollData).startDate = new Date(dateString);
                startDateError.textContent = "";
                validStartDate.textContent = '✓';
                document.querySelector(".submitButton").disabled = false;
            } catch (error) {
                startDateError.textContent = error;
                validStartDate.textContent = "";
                document.querySelector(".submitButton").disabled = true;
            }
        });
    }

    const salary = document.querySelector("#salary");
    const output = document.querySelector(".salary-output");
    if (salary) {
        salary.oninput = function() {
            output.textContent = salary.value;
        };
    }
});

const save = () => {
    try {
        let employeePayrollData = createEmployeePayrollObject();
        if (employeePayrollData != undefined) updateLocalStorage(employeePayrollData);
    } catch (submitError) {
        alert(submitError);
        return;
    }
};

const createEmployeePayrollObject = () => {
    let employeePayrollData = new EmployeePayrollData();

    employeePayrollData.name = getValue("#name");
    employeePayrollData.gender = getSelectedValues("[name=gender]").pop();
    employeePayrollData.profilePicture = getSelectedValues("[name=profile]").pop();
    employeePayrollData.salary = getValue("#salary");
    dateString = document.querySelector("#month").value + " " + document.querySelector("#day").value + ", " + document.querySelector("#year").value;
    employeePayrollData.startDate = new Date(dateString);
    employeePayrollData.note = getValue("#notes");
    try {
        employeePayrollData.departments = getSelectedValues("[name=department]");
    } catch (error) {
        alert(error);
        return;
    }
    employeePayrollData.id = createEmployeeId();
    alert("Employee Added Successfully!\n" + employeePayrollData.toString());
    return employeePayrollData;
};

const getSelectedValues = (propertyName) => {
    let allValues = document.querySelectorAll(propertyName);
    let selectedValues = [];
    allValues.forEach(input => {
        if (input.checked) selectedValues.push(input.value);
    });
    return selectedValues;
};

const getValue = (propertyId) => {
    let value = document.querySelector(propertyId).value;
    return value;
};

function updateLocalStorage(employeePayrollData) {
    let employeePayrollList = JSON.parse(localStorage.getItem("EmployeePayrollList"));
    if (employeePayrollList != undefined) {
        employeePayrollList.push(employeePayrollData);
    } else {
        employeePayrollList = [employeePayrollData];
    }
    alert("Local Storage Updated Successfully!\nTotal Employees : " + employeePayrollList.length);
    localStorage.setItem("EmployeePayrollList", JSON.stringify(employeePayrollList));
}

const createEmployeeId = () => {
    let employeeId = localStorage.getItem("EmployeeID");
    employeeId = !employeeId ? 1 : (parseInt(employeeId) + 1).toString();
    localStorage.setItem("EmployeeID", employeeId);
    return employeeId;
};

const resetForm = () => {
    setDefaultValue("#name", "");
    setDefautlText(".name-error");
    setDefautlText(".valid-name");
    unsetSelectedValues("[name=profile]");
    unsetSelectedValues("[name=gender]");
    unsetSelectedValues("[name=department]");
    resetRange("#salary", ".salary-output");
    setDefaultValue("#day", "1");
    setDefaultValue("#month", "January");
    setDefaultValue("#year", "2020");
    setDefautlText(".startDate-error");
    setDefautlText(".valid-startDate");
    setDefaultValue("#notes", "");
};

const setDefaultValue = (propertyId, value) => {
    const element = document.querySelector(propertyId);
    element.value = value;
};

const unsetSelectedValues = (propertyName) => {
    allValues = document.querySelectorAll(propertyName);
    allValues.forEach(input => input.checked == false);
};

const resetRange = (propertyId, outputId) => {
    const rangeElement = document.querySelector(propertyId);
    rangeElement.value = 400000;
    const outputElement = document.querySelector(outputId);
    outputElement.textContent = rangeElement.value;
};

const setDefautlText = (propertyId) => {
    const contentElement = document.querySelector(propertyId);
    contentElement.textContent = "";
};






let site_properties = {
    home_page: "../pages/home.html",
    add_emp_payroll_page: "../pages/employee_payroll_form.html"
};




const stringifyDate = (date) => {
    const options = { day: 'numeric', month: 'short', year: 'numeric' };
    const newDate = !date ? "undefined" : new Date(Date.parse(date)).toLocaleDateString('en-GB', options);
    return newDate;
}
