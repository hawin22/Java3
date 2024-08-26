create database Sach
use Sach
CREATE TABLE Sach
(
    Id BIGINT IDENTITY(1,1) PRIMARY KEY,
    Ma VARCHAR(20),
    Ten NVARCHAR(30),
    NgayXuatBan DATE,
    SoTrang INT NULL,
    DonGia Decimal(20,0) NULL,
    TrangThai INT NULL,
);
select ma,ten, DonGia, TrangThai from Sach
update Sach set ten = ?, DonGia = ?, TrangThai = ? where ma = ?
delete from Sach where Ma = ?

insert into Sach
values 
('Sach1', 'nhan', '2023-02-22', 233, 45555,1),
('Sach3', 'nhu', '2023-02-22', 233, 56666,1),
('Sach4', 'thu', '2023-02-22', 233, 85555,0)