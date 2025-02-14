USE [master]
GO
/****** Object:  Database [asm]    Script Date: 12/5/2023 10:34:58 AM ******/
CREATE DATABASE [asm]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'asm', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.HAWIN\MSSQL\DATA\asm.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'asm_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.HAWIN\MSSQL\DATA\asm_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [asm] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [asm].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [asm] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [asm] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [asm] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [asm] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [asm] SET ARITHABORT OFF 
GO
ALTER DATABASE [asm] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [asm] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [asm] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [asm] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [asm] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [asm] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [asm] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [asm] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [asm] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [asm] SET  ENABLE_BROKER 
GO
ALTER DATABASE [asm] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [asm] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [asm] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [asm] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [asm] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [asm] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [asm] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [asm] SET RECOVERY FULL 
GO
ALTER DATABASE [asm] SET  MULTI_USER 
GO
ALTER DATABASE [asm] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [asm] SET DB_CHAINING OFF 
GO
ALTER DATABASE [asm] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [asm] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [asm] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [asm] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'asm', N'ON'
GO
ALTER DATABASE [asm] SET QUERY_STORE = OFF
GO
USE [asm]
GO
/****** Object:  Table [dbo].[Diem]    Script Date: 12/5/2023 10:34:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Diem](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[masv] [varchar](20) NULL,
	[tienganh] [int] NULL,
	[tinhoc] [int] NULL,
	[gdtc] [int] NULL,
 CONSTRAINT [diem_PK] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 12/5/2023 10:34:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SinhVien](
	[masv] [varchar](20) NOT NULL,
	[hoten] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[sodt] [nvarchar](50) NULL,
	[diachi] [nvarchar](200) NULL,
	[gioitinh] [bit] NULL,
	[Hinh] [nvarchar](100) NULL,
 CONSTRAINT [sinh_vien_PK] PRIMARY KEY CLUSTERED 
(
	[masv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/5/2023 10:34:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[username] [varchar](20) NOT NULL,
	[password] [varchar](50) NULL,
	[role] [varchar](50) NULL,
 CONSTRAINT [taikhoan_PK] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Diem] ON 

INSERT [dbo].[Diem] ([id], [masv], [tienganh], [tinhoc], [gdtc]) VALUES (12, N'PH01', 8, 8, 9)
INSERT [dbo].[Diem] ([id], [masv], [tienganh], [tinhoc], [gdtc]) VALUES (21, N'PH02', 9, 8, 8)
INSERT [dbo].[Diem] ([id], [masv], [tienganh], [tinhoc], [gdtc]) VALUES (23, N'PH03', 9, 9, 10)
INSERT [dbo].[Diem] ([id], [masv], [tienganh], [tinhoc], [gdtc]) VALUES (27, N'abc', 10, 9, 9)
SET IDENTITY_INSERT [dbo].[Diem] OFF
GO
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'abc', N'Nguyễn Thị A', N'anguyen123@gmail.com', N'0598765372', N'HN', 0, N'D:\Pictures\gia-tuong-composite-10309.jpg')
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'PH01', N'Phạm Thị Quỳnh Thu', N'thupqt123@gmail.com', N'012397654', N'Phú Thọ', 0, N'D:\Pictures\Ảnh đại diện.jpg')
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'PH02', N'Nguyễn Hữu Nghĩa', N'nghia123@gmail.com', N'0359765372', N'LC', 1, N'D:\Pictures\cậu bé.png')
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'PH03', N'Nguyễn Văn B', N'nghia123@gmail.com', N'0359765372', N'LC', 1, N'D:\Pictures\imgtd.jpg')
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'PH04', N'Hoàng Thọ Chính', N'chinh321@gmail.com', N'064257872', N'NĐ', 1, N'D:\Pictures\Mr. Bean.jpeg')
INSERT [dbo].[SinhVien] ([masv], [hoten], [email], [sodt], [diachi], [gioitinh], [Hinh]) VALUES (N'PH05', N'Phùn Văn Lềnh', N'lenh789@gmail.com', N'034683572', N'QN', 1, N'D:\Pictures\bọt biển.jpg')
GO
INSERT [dbo].[TaiKhoan] ([username], [password], [role]) VALUES (N'cb', N'456', N'CBDT')
INSERT [dbo].[TaiKhoan] ([username], [password], [role]) VALUES (N'gv', N'123', N'GV')
GO
ALTER TABLE [dbo].[Diem]  WITH CHECK ADD FOREIGN KEY([masv])
REFERENCES [dbo].[SinhVien] ([masv])
GO
USE [master]
GO
ALTER DATABASE [asm] SET  READ_WRITE 
GO
