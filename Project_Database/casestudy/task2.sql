select *
from nhanvien
where ten like '[htk]%' and length(concat(ho,' ',ten)) <= 15 ;