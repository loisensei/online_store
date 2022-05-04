
function load(){

}

load()

document.getElementById("form_them_san_pham").addEventListener("submit",function (e){
    e.preventDefault();
    const data = new FormData();
    data.append("ten",document.getElementById("tenSanPham").value);
    data.append("gia",document.getElementById("gia").value);
    data.append("gioiTinh",document.getElementById("gioiTinh").value);
    data.append("mauSac",document.getElementById("mauSac").value);
    data.append("soLuong",document.getElementById("soLuong").value);
    data.append("moTa",document.getElementById("moTa").value);
    data.append("danhMuc",document.getElementById("danhMuc").value);
    data.append("nhanHieu",document.getElementById("nhanHieu").value);
    data.append("anh",document.getElementById("hinhAnh").files[0]);
    var url = "http://localhost:8080/api/sanpham/luu";
    fetch(url,{
        method:"POST",
        body: data
        // headers: {
        //     "Content-Type": "multipart/form-data"
        // },
        // mode : "no-cors"
    })
        .then(function (response){
            return response.json()
        })
        .then(function (doiTuongTraVe){
            alert(doiTuongTraVe.thongBao)
        })
})