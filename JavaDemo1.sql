
create database Java3
go
use Java3
CREATE TABLE Students
(
    MaSV varchar(20) NOT NULL,
    Hoten nvarchar(50) NULL,
    Email nvarchar(50) NULL,
    SoDT nvarchar(50) NULL,
    Diachi nvarchar(200) NULL,
    Gioitinh bit NULL,
    CONSTRAINT sinh_vien_PK PRIMARY KEY (MaSV)
);
-- Slide 6
CREATE TABLE Country 
(
    code varchar(20) NOT NULL PRIMARY KEY,
    name nvarchar(100) NOT NULL
);

CREATE TABLE Employee
(
    id BIGINT PRIMARY KEY IDENTITY (1, 1),
    name nvarchar(50) NOT NULL,
    pass varchar(50) NULL,
    email nvarchar(50) NULL,
    country nvarchar(100) NULL
);
select MaSV, Hoten from Students
insert into Students(MaSV, Hoten, Email, SoDT, Diachi, Gioitinh) 
values
('PH01', N'Nguyễn Hữu Nghĩa', 'nghianhph46340', '0123456789', 'HN', 1),
('PH02', N'Hoàng Thọ Chính', 'chinhhtph46334', '0123456249', 'HN', 1),
('PH03', N'Vũ Tuấn Huy', 'huyvtph46307', '0546456789', 'HN', 1);
select * from Employee
insert into Employee(name, email, country)
values
(N'Hawin', 'hawin123@gmail.com', N'Phú Thọ'),
(N'Thu', 'thu3221@gmail.com', N'Hà Nội'),
(N'Nhân', 'nhan34@gmail.com', N'Hà Nội'),
(N'Như', 'nhu789@gmail.com', N'Phú Thọ')