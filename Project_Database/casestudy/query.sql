-- Task 2
select *
from nhanvien
where (ten like 'h%' or ten like 't%' or ten like 'k%') and length(hoten) <= 15 ;

-- Task 3
select *  
from khachhang
where diaChi in ('da nang','quang tri') and year(ngaySinh) <= 2002 and year(ngaySinh) >= 1970;

-- Task 4
select khachhang.hoten as 'Ten Khach Hang',
		loaikhach.tenLoaiKhach as 'Loai Khach Hang',
		count(hopdong.idHopDong) as 'So lan dat phong'
from loaikhach join khachhang on loaikhach.idLoaiKhach = khachhang.idLoaiKhach
join hopdong on khachhang.idKhachHang = hopdong.idKhachHang
where tenLoaiKhach = 'diamond'
group by khachhang.idKhachHang
order by count(hopdong.idHopDong) desc;    

-- Task 5
select khachhang.idKhachHang,khachhang.hoTen,loaikhach.tenLoaiKhach,hopdong.idHopDong,hopdong.ngayLamHopDong,
		sum(dichvu.chiPhiThue + (hopdongchitiet.soLuong * dichvudikem.gia)) as 'Tong Tien'
from khachhang
left join loaikhach on khachhang.idLoaiKhach = loaikhach.idLoaiKhach
left join hopdong on khachhang.idKhachHang = hopdong.idKhachHang
left join dichvu on hopdong.idDichVu = dichvu.idDichVu
left join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
left join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
group by idHopDong;
	
-- Task 6
select dichvu.idDichVu, dichvu.tenDichVu,dichvu.dienTich,dichvu.chiPhiThue,loaidichvu.tenLoaiDichVu
from dichvu
join loaidichvu on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
where not exists(
	select hopdong.idHopDong
	from hopdong
	where (hopdong.ngayLamHopDong between '2019-01-01' and '2019-03-31') and hopdong.idDichVu = dichvu.idDichVu);

-- Task 7
select dichvu.idDichVu,dichvu.tenDichVu,dichvu.dienTich,dichvu.chiPhiThue,dichvu.soNguoiToiDa,
		loaidichvu.tenLoaiDichVu
from dichvu
join loaidichvu
on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
where exists(
	select hopdong.idHopDong
	from hopdong
    where year(hopdong.ngayLamHopDong) = '2018' and hopdong.idDichVu = dichvu.idDichVu)
and not exists(
    select hopdong.idHopDong
    from hopdong
    where year(hopdong.ngayLamHopDong) = '2019' and hopdong.idDichVu = dichvu.idDichVu);

-- Task8 C1
select distinct hoten
from khachhang;

-- Task8 C2
select hoten
from khachhang
group by hoten;

-- Task8 C3
select hoten from khachhang
union
select hoten from khachhang;

-- Task 9
select months.month,count(*)
from hopdong
cross join months
where month(ngayLamHopDong) = month and year(ngayLamHopDong) = 2019
group by month;

-- Task 10
select hopdong.idHopDong, hopdong.ngayLamHopDong,hopdong.ngayKetThuc,hopdong.tienDatCoc,
		sum(hopdongchitiet.soluong) as 'So luong dich vu di kem'
from hopdong
join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
group by idHopDong;        

-- Task 11
select distinct dichvudikem.idDichVuDiKem, dichvudikem.tenDichVuDiKem, dichvudikem.gia, dichvudikem.donVi
from hopdong
join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
where exists(
	select khachhang.idKhachHang from khachhang
	join loaikhach on khachhang.idLoaiKhach = loaikhach.idLoaiKhach
	where khachhang.diachi in ('vinh', 'quang ngai') and loaikhach.tenLoaiKhach = 'diamond'
		and khachhang.idKhachHang = hopdong.idKhachHang);        
        
-- Task 12

select hopdong.idHopDong, nhanvien.hoTen as 'Ten nhan vien',khachhang.hoTen as 'Ten khach hang',
		khachhang.soDienThoai,dichvu.tenDichVu,tienDatCoc
from hopdong
left join dichvu on hopdong.idDichVu =dichvu.idDichVu
left join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
left join nhanvien on hopdong.idNhanVien = nhanvien.idNhanVien
left join khachhang on hopdong.idKhachHang = khachhang.idKhachHang
where dichvu.idDichVu in
	(select hopdong.idDichVu from hopdong where  hopdong.ngayLamHopDong between '2019-10-01' and '2019-12-31')
    and dichvu.idDichVu not in
    (select hopdong.idDichVu from hopdong where hopdong.ngayLamHopDong between '2019-01-01' and '2019-06-30')
    and month(NgayLamHopDong) in (10, 11, 12)
group by hopdong.idHopDong;
    
-- Task 13
with previous_result as(
select idDichVuDiKem, sum(soluong) as 'Soluong'
from hopdongchitiet
group by idDichVuDiKem
)
select dichvudikem.tenDichVuDiKem, max(previous_result.Soluong) as 'So lan su dung'
from previous_result
join dichvudikem
on previous_result.idDichVuDiKem = dichvudikem.idDichVuDiKem;

-- Task 14
/*with previous_result as(
select idHopDong,idDichVuDiKem, sum(soluong) as 'Soluong'
from hopdongchitiet
group by idDichVuDiKem
)
select hopdong.idHopDong,loaidichvu.tenLoaiDichVu,dichvudikem.tenDichVuDiKem,previous_result.Soluong as 'So lan su dung'
from previous_result
join dichvudikem
on previous_result.idDichVuDiKem = dichvudikem.idDichVuDiKem
join hopdong
on previous_result.idHopDong = hopdong.idHopDong
join dichvu
on hopdong.idDichVu = dichvu.idDichVu
join loaidichvu
on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
where previous_result.Soluong = 1
group by tenDichVuDiKem;*/

select hopdong.idHopDong,loaidichvu.tenLoaiDichVu,dichvudikem.tenDichVuDiKem,sum(hopdongchitiet.Soluong) as 'So lan su dung'
from hopdong
join hopdongchitiet on hopdong.idHopDong = hopdongchitiet.idHopDong
join dichvudikem on hopdongchitiet.idDichVuDiKem = dichvudikem.idDichVuDiKem
join dichvu on hopdong.idDichVu = dichvu.idDichVu
join loaidichvu on dichvu.idLoaiDichVu = loaidichvu.idLoaiDichVu
group by tenDichVuDiKem
having sum(hopdongchitiet.soLuong) = 1;

-- Task 15
select nhanvien.idNhanVien, nhanvien.hoTen, trinhdo.tenTrinhDo,bophan.tenBoPhan,nhanvien.soDienThoai,nhanvien.diaChi
from nhanvien
join trinhdo on nhanvien.idTrinhDo = trinhdo.idTrinhDo
join bophan on nhanvien.idBoPhan = bophan.idBoPhan
where exists (
	select idHopDong
    from hopdong
    where (year(hopdong.ngayLamHopDong) between 2018 and 2019) and hopdong.idNhanVien = nhanvien.idNhanVien
    group by hopdong.idNhanVien
    having  count(hopdong.idNhanVien) <= 3)
 or not exists(
	select idNhanVien
    from hopdong
    where  hopdong.idNhanVien = nhanvien.idNhanVien);
    
-- Task 16
delete from nhanvien
where idNhanVien not in (
	select hopdong.idNhanVien
    from hopdong
    where year(hopdong.ngayLamHopDong) between 2017 and 2019
    group by idNhanVien);
    
-- Task 17
update khachhang
set idLoaiKhach = 1
where idKhachHang in(
	select hopdong.idKhachHang
	from hopdong
	where year(hopdong.ngayLamHopDong) = 2019 and hopdong.tongTien > 10000000);
    
-- Task 18
alter table hopdong
drop foreign key hopdong_ibfk_2;
alter table hopdong
add constraint hopdong_ibfk_2
foreign key(idKhachHang) references khachhang(idKhachHang)
on delete cascade;     
delete from khachhang
where idKhachHang in(
	select hopdong.idKhachHang
from hopdong
where year(ngayLamHopDong) < 2016);    
    
-- Task 19
update dichvudikem
set dichvudikem.gia = dichvudikem.gia*2
where idDichVuDiKem in(
	select hopdongchitiet.idDichVuDiKem
    from hopdongchitiet
    group by hopdongchitiet.idDichVuDiKem
    having sum(hopdongchitiet.soLuong) > 10);

-- Task 20
select idNhanVien as ID, hoTen, email, soDienThoai, ngaySinh, diaChi
from nhanvien
union all
select idKhachHang as ID, hoTen, email, soDienThoai, ngaySinh, diaChi
from khachhang;


