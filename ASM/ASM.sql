create database asm
go

use asm
go

CREATE TABLE TaiKhoan
(
    username varchar(20) NOT NULL,
    password varchar(50) NULL,
    role varchar(50) NULL,
    CONSTRAINT taikhoan_PK PRIMARY KEY (username)
);

insert into TaiKhoan
values
('gv', '123','GV'),
('cb', '456', 'CBDT')
CREATE TABLE SinhVien
(
    masv varchar(20) NOT NULL,
    hoten nvarchar(50) NULL,
    email nvarchar(50) NULL,
    sodt nvarchar(50) NULL,
    diachi nvarchar(200) NULL,
    gioitinh bit NULL,
    CONSTRAINT sinh_vien_PK PRIMARY KEY (masv),
	Hinh nvarchar(100)
);

CREATE TABLE Diem(
    id BIGINT IDENTITY (1, 1),
    masv varchar(20) NULL,
    tienganh int NULL,
    tinhoc int NULL,
    gdtc int NULL,
    CONSTRAINT diem_PK PRIMARY KEY (id),
    FOREIGN KEY (masv) REFERENCES SinhVien(masv)
);

select masv, hoten, email, sodt, diachi, gioitinh, Hinh from SinhVien
insert into SinhVien(masv, hoten, email, sodt, diachi, gioitinh, Hinh)
values
('PH04', N'Hoàng Thọ Chính', N'chinh321@gmail.com', N'064257872', N'NĐ',1 , N'‪D:\Pictures\Mr. Bean.jpeg'),
('PH05', N'Phùn Văn Lềnh', N'lenh789@gmail.com', N'034683572', N'QN',1 , N'‪D:\Pictures\bọt biển.jpg')
('abc', N'Nguyễn Thị A', N'anguyen123@gmail.com', N'0598765372', N'HN',0 , N'‪D:\Pictures\Gấu.jpg'),
('PH04', N'Hoàng Thọ Chính', N'chinh321@gmail.com', N'064257872', N'NĐ',1 , N'‪D:\Pictures\Mr. Bean.jpeg'),
('PH05', N'Phùn Văn Lềnh', N'lenh789@gmail.com', N'034683572', N'QN',1 , N'‪D:\Pictures\bọt biển.jpg')
('PH01', N'Phạm Thị Quỳnh Thu', N'thupqt123@gmail.com', N'012397654', N'Phú Thọ', 0, N'D:\Pictures\Ảnh đại diện.jpg'),
('PH02', N'Nguyễn Hữu Nghĩa', N'nghia123@gmail.com', N'0359765372', N'LC',1 , N'D:\Pictures\cậu bé.png'),
('PH03', N'Nguyễn Van B', N'nghia123@gmail.com', N'0359765372', N'LC',1 , N'D:\Pictures\cậu bé.png')

delete from SinhVien where masv = ?
UPDATE SinhVien set hoten = ?, email = ?, sodt = ?, diachi = ?, gioitinh = ?, Hinh = ? where masv = ?
select d.masv, s.hoten, d.tienganh, d.tinhoc, d.gdtc from Diem d
join SinhVien s on d.masv = s.masv
insert into Diem(masv, tienganh, tinhoc, gdtc)
values 
('PH01',8.0,9.0,9.0),
('PH02',9.0,9.0,9.0)
delete from Diem where masv = 'PH02'
update Diem set tienganh = ?, tinhoc = ?, gdtc = ? where masv = ? 
select d.masv, s.hoten,tienganh,tinhoc,gdtc from Diem d
right join SinhVien s on d.masv = s.masv where s.masv = 'PH01'
select * from Diem
delete SinhVien where masv = 'PH01'
insert into Diem(masv) values ? 
select d.masv, s.hoten,tienganh,tinhoc,gdtc from Diem d 
right join SinhVien s on d.masv = s.masv where s.masv like  N'PH01'
select d.masv, s.hoten,tienganh,tinhoc,gdtc from diem d join SinhVien s ON d.masv=s.masv 
ORDER BY (d.gdtc+d.tienganh+d.tinhoc) asc

select username, password, role from TaiKhoan