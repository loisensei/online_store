const sanPhamsApi = "http://localhost:8080/api/sanpham/get/all";
var listSanPham = [];
function load() {
    var element = document.getElementById("idDanhMuc");
    let idDanhMuc;
    if (element) idDanhMuc = document.getElementById("idDanhMuc").value;
    console.log(idDanhMuc)
    laySanPhams(idDanhMuc);

}
load();
function laySanPhams(id) {
    id = Number(id);
    console.log(typeof id);
    fetch(sanPhamsApi)
        .then(function (response){
            return response.json();
        })
        .then(function (sanPhams){
            if(!id){
                listSanPham = sanPhams;
            }else{
                listSanPham = sanPhams.filter( (sanPham) =>{
                    if(sanPham.danhMuc.id === id){
                        return sanPham;
                    }
                })
            }
            sanPhamMoi(listSanPham[listSanPham.length - 1])
            xuatHTML(listSanPham);
        });
}

let trangHienTai = 1;
let soSanPhamTrang = 6;
let batDau = 0;
let ketThuc = soSanPhamTrang;
let soSanPham = 0;
let soTrang;

function xuatHTML(sanPhams) {
    soSanPham = sanPhams.length;
    soTrang = Math.ceil(soSanPham/soSanPhamTrang);
    console.log(soTrang);
    const sanPhamView = document.getElementById("listSanPham");
    const htmls = sanPhams.map((sanPham , index) => {
        if(index >= batDau && index <ketThuc) {
            return `
                <div class="col-12 col-md-6 col-lg-4 product">
                    <div class="card">
                        <img class="card-img-top" src="${sanPham.pathAnh}" alt="Card image cap">
                        <div class="card-body">
                            <h4 class="card-title show_txt"><a href="/chi-tiet-san-pham?id=${sanPham.id}" title="View Product">${sanPham.ten}</a></h4>
                            <p class="card-text show_txt">${sanPham.danhMuc.ten} / ${sanPham.nhanHieu.ten}</p>
                            <div class="row price-add-to-card">
                                <div class="col price">
                                    <p class="btn btn-danger btn-block">${sanPham.gia.toLocaleString('vi-VN', {
                style: 'currency',
                currency: 'VND'
            })}</p>
                                </div>
                                <div class="col add-to-card">
                                    <a href="#" class="btn btn-success ">Thêm vào giỏ</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        `;
        }
    })
    sanPhamView.innerHTML = htmls.join('');
}

document.getElementById("btn-sau").addEventListener('click',() => {
    trangHienTai ++;
    if(trangHienTai > soTrang) trangHienTai = soTrang;
    batDau = (trangHienTai - 1) * soSanPhamTrang;
    ketThuc = trangHienTai * soSanPhamTrang;
    xuatHTML(listSanPham);
})

document.getElementById("btn-truoc").addEventListener('click',() => {
    trangHienTai --;
    if(trangHienTai < 1) trangHienTai = 1;
    batDau = (trangHienTai - 1) * soSanPhamTrang;
    ketThuc = trangHienTai * soSanPhamTrang;
    xuatHTML(listSanPham);
})


function khiClickNhanHieu(id) {
    var sanPhamTheoNhanHieu = [];
    const fun = listSanPham.map(function (sanPham) {
        if(sanPham.nhanHieu.id === id){
            sanPhamTheoNhanHieu.push(sanPham);
            return sanPham;
        }
    })
    xuatHTML(sanPhamTheoNhanHieu);

}
 function khiClickDanhMuc(id){
    if(id === 0) window.location = "http://localhost:8080/trang-san-pham";
    window.location = "http://localhost:8080/trang-san-pham?idCategory="+id;
     // var sanPhamTheoDanhMuc = [];
     // const fun = listSanPham.map(function (sanPham) {
     //     if(sanPham.danhMuc.id === id){
     //         sanPhamTheoDanhMuc.push(sanPham);
     //         return sanPham;
     //     }
     // })
     // xuatHTML(sanPhamTheoDanhMuc);
 }

 function sanPhamMoi(sanPham){
    document.getElementById('sanPhamMoi').innerHTML = `
                <div class="card-body">
                    <img class="img-fluid" src="${sanPham.pathAnh}" />
                    <h5 class="card-title">${sanPham.ten}</h5>
                    <p class="card-text">${sanPham.danhMuc.ten} / ${sanPham.nhanHieu.ten}</p>
                    <p class="bloc_left_price">${sanPham.gia.toLocaleString('vi-VN', {style: 'currency', currency: 'VND'})}</p>
                </div>
    `;
 }

function xuatDanhSachTrang() {
    // let html = '';
    // html += `<li class="page-item active"><a class="page-link">1</a></li>`
    // html += `<li class="page-item"><a class="page-link">2</a></li>`;
    // document.getElementById("so-trang").innerHTML = html.join('');
}

xuatDanhSachTrang();