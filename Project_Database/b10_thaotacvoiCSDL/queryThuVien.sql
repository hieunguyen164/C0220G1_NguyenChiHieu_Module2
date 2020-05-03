-- Hien thi tat ca sach co trong thu vien
select *
from sach;

-- Hien thi sach lap trinh trong thu vien
select tenSach, tenLoaiSach
from sach
join loaisach
on sach.idLoaiSach = loaiSach.idLoaiSach
where tenLoaiSach = 'sach lap trinh';

-- Hien thi tat ca sach dang duoc muon, cac hoc vien dang muon sach
select tenSinhVien,tenSach,tenLoaiSach,ngayMuon,tinhTrang
from sach
join loaisach
on sach.idLoaiSach = loaisach.idLoaiSach
join chitietphieumuon
on sach.idSach = chitietphieumuon.idSach
join phieumuon
on chitietphieumuon.idPhieuMuon = phieumuon.idPhieuMuon
join sinhvien
on phieumuon.idSinhVien = sinhvien.idSinhVien
where tinhtrang = 'chua tra';
