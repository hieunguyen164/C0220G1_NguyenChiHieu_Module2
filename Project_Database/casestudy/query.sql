-- Task 2
select *
from nhanvien
where ten like '[htk]%' and length(concat(ho,' ',ten)) <= 15 ;

-- Task 3
select *  
from khachhang
where diaChi in ('da nang','quang tri') and year(ngaySinh) <= 2002 and year(ngaySinh) >= 1970;