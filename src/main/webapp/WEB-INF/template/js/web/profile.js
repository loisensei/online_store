
const profile_form = document.getElementById("profile-form");
profile_form.addEventListener("submit",function (e){
    e.preventDefault();

    const name = document.getElementById("name");
    const username = document.getElementById("username");
    const email = document.getElementById("email");
    const address = document.getElementById("address");
    const newPassword = document.getElementById("newPassword");
    const confirmPassword = document.getElementById("confirmPassword");

    const data = {
        'fullName': name.value,
        'userName': username.value,
        'email': email.value,
        'address': address.value,
        'password': confirmPassword.value
    };
    if (newPassword.value != confirmPassword.value){
        document.getElementById('warn-cf-pass').innerHTML = "password incorrect!";
    }else {
        const url = "http://localhost:8080/api/account/update";
        fetch(url, {
            method: "POST",
            body: JSON.stringify(data),
            headers: {
                "Content-Type": "application/json; charset=UTF-8"
            }
        })
            .then(function (response) {
                if (response.ok) {
                    alert("change success!");
                }
            })
            .catch(function (e) {
                alert("error: " + e);
            })
    }

})