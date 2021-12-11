create database FPL_DAOTAO
go
use FPL_DAOTAO
go
create table STUDENTS(
	MASV NVARCHAR(50) PRIMARY KEY NOT NULL ,
	Hoten Nvarchar(50),
	Email Nvarchar(50),
	SoDT nvarchar(15),
	GioiTinh bit ,
	DiaChi nvarchar(50),
	Hinh Nvarchar(50)
)
go
create table GRADE(
	ID int primary key not null,
	MASV NVARCHAR(50) foreign key references STUDENTS(MASV),
	Tienganh float ,
	Tinhoc float,
	GDTC float
)
go
Create table USERS (
	username nvarchar(50)  primary key not null,
	password nvarchar(50),
	role nvarchar(50),
)
go
if OBJECT_ID('SP_STUDENTS') is not null
drop proc SP_STUDENTS
go
create proc SP_STUDENTS
	@MASV NVARCHAR(50),
	@Hoten Nvarchar(50),
	@Email Nvarchar(50),
	@SoDT nvarchar(15),
	@GioiTinh bit ,
	@DiaChi nvarchar(50),
	@Hinh Nvarchar(50)
as
	if @MASV IS NULL OR @Hoten IS NULL OR @Email IS NULL OR @SoDT IS NULL OR @GioiTinh IS NULL OR
	@DiaChi IS NULL OR @Hinh IS NULL 
		PRINT N'LỖI DỮ LIỆU'
	ELSE
	INSERT STUDENTS VALUES (
	@MASV ,@Hoten ,@Email, @SoDT, @GioiTinh, @DiaChi, @Hinh)
go
EXEC SP_STUDENTS 'SV01',N'Đồng Thái Dương','duongdt@gmail.com','0528192708',0,N'Hiệp Hòa - Bắc Giang','SV01.png'
EXEC SP_STUDENTS 'SV02',N'Nguyễn Thái Hùng','hungnt@gmail.com','0697192700',0,N'223 Lĩnh Nam','SV02.png'
EXEC SP_STUDENTS 'SV03',N'Hoàng Đức Anh','anhhd@gmail.com','0668192609',0,N'12 Cầu Giấy','SV03.png'
EXEC SP_STUDENTS 'SV04',N'Phạm Hoàng Anh','anhph@gmail.com','0528192705',0,N'145 Hai Bà Trưng','SV04.png'
EXEC SP_STUDENTS 'SV05',N'Tăng Phương Chi','chitp@gmail.com','0528192702',1,N'20 Cầu Giấy','SV05.png'

go

if OBJECT_ID('SP_GRADE') is not null
drop proc SP_GRADE
go
create proc SP_GRADE
	@ID int ,
	@MASV NVARCHAR(50) ,
	@Tienganh int ,
	@Tinhoc int,
	@GDTC int
as
	IF @ID IS NULL OR @MASV IS NULL OR  @Tienganh IS NULL OR  @Tinhoc IS NULL OR  @GDTC IS NULL 
		PRINT N'LỖI DỮ LIỆU'
	ELSE 
	INSERT GRADE VALUES (@ID ,@MASV ,@Tienganh, @Tinhoc, @GDTC)
GO
EXEC SP_GRADE 1,'SV01',10,10,10
EXEC SP_GRADE 2,'SV02',9,8,10
EXEC SP_GRADE 3,'SV03',9,7,10
EXEC SP_GRADE 4,'SV04',9,5,6
EXEC SP_GRADE 5,'SV05',5,5,4

go

if OBJECT_ID('SP_INUSERS') is not null
drop proc SP_INUSERS
go
create proc SP_INUSERS
	@username nvarchar(50) ,
	@password nvarchar(50),
	@role nvarchar(50)
AS
	IF @username IS NULL OR @password IS NULL OR @role IS NULL 
		PRINT N'LỖI DỮ LIỆU'
	ELSE 
	INSERT USERS VALUES (@username,@password,@role)
go	 
EXEC SP_INUSERS 'admin','123','admin'
EXEC SP_INUSERS 'leo','2222','admin'
EXEC SP_INUSERS 'fpl','123','admin'
EXEC SP_INUSERS 'duong','1234','student'
EXEC SP_INUSERS 'teacher','12345','teacher'