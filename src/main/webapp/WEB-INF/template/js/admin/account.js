
const url = "http://localhost:8080/api/account/get/all";

function load() {
    getAccount(renderAccount);
}

load();

function getAccount(callback) {
    fetch(url)
        .then(function (response) {
            return response.json()
        })
        .then(callback);
}

function renderAccount(accounts) {
    console.log(accounts);
    const tbody = document.querySelector('tbody');
    const htmls = accounts.map(function (account) {
        console.log(account.role);
        const role = account.role.map(function (rl){
            console.log(rl);
            return `
                <p>${rl.roleName}</p>
            `;
        })
        return `
                 <tr>
                    <td>${account.id}</td>
                    <td>${account.userName}</td>
                    <td>${account.email}</td>
                    <td>${account.fullName}</td>
                    <td>${account.address}</td>
                    <td>${role}</td>
                    <td><a data-toggle="modal" onclick="onDeleteAccount(${account.id})"><i class="fa-solid fa-trash-can" style="color: #620e0e"></i></a></td>
                    
                </tr>
        `;
    });
    tbody.innerHTML = htmls.join('');
}

function onDeleteAccount(id){
    const deleteApi = "http://localhost:8080/api/account/delete/" + id;
    fetch(deleteApi,{
        method:"DELETE"
    })
        .then(function (response) {
            if(response.ok){
                alert("Xóa thành công!");
            }
            getAccount(renderAccount);
        });

}

// ------------------ add account ------------------------------------
document.getElementById("form_add_account").addEventListener("submit",function (e){
    e.preventDefault();
    const username = document.getElementById("username");
    const password = document.getElementById("password");
    const email = document.getElementById("email");
    const address = document.getElementById("address");
    const roleName = document.getElementById("role");

    const data = {
        'userName': username.value,
        'email': email.value,
        'address': address.value,
        'password': password.value,
        'roleName': 'ROLE_'+roleName.value
    };
    console.log(data);
    if (password.value === ''){
        alert("Mật khẩu không được để trống!");
    }else {
        const url = "http://localhost:8080/api/account/save";
        fetch(url, {
            method: "POST",
            body: JSON.stringify(data),
            headers: {
                "Content-Type": "application/json; charset=UTF-8"
            }
        })
            .then(function (response) {
                return response.json();
            })
            .then(function (doiTuongTraVe){
                alert(doiTuongTraVe.thongBao);
                getAccount(renderAccount);
            })
    }
})