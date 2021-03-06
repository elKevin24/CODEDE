USE [master]
GO
/****** Object:  Database [bd_proyecto]    Script Date: 17/09/2020 17:56:46 ******/
CREATE DATABASE [bd_proyecto]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'bd_proyecto', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\bd_proyecto.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'bd_proyecto_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\bd_proyecto_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [bd_proyecto] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [bd_proyecto].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [bd_proyecto] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [bd_proyecto] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [bd_proyecto] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [bd_proyecto] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [bd_proyecto] SET ARITHABORT OFF 
GO
ALTER DATABASE [bd_proyecto] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [bd_proyecto] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [bd_proyecto] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [bd_proyecto] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [bd_proyecto] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [bd_proyecto] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [bd_proyecto] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [bd_proyecto] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [bd_proyecto] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [bd_proyecto] SET  DISABLE_BROKER 
GO
ALTER DATABASE [bd_proyecto] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [bd_proyecto] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [bd_proyecto] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [bd_proyecto] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [bd_proyecto] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [bd_proyecto] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [bd_proyecto] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [bd_proyecto] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [bd_proyecto] SET  MULTI_USER 
GO
ALTER DATABASE [bd_proyecto] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [bd_proyecto] SET DB_CHAINING OFF 
GO
ALTER DATABASE [bd_proyecto] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [bd_proyecto] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [bd_proyecto] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [bd_proyecto] SET QUERY_STORE = OFF
GO
USE [bd_proyecto]
GO
/****** Object:  Table [dbo].[residencia]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[residencia](
	[id_residencia] [int] NOT NULL,
	[id_municipio] [int] NULL,
	[id_direccion] [nvarchar](50) NULL,
 CONSTRAINT [PK_residencia] PRIMARY KEY CLUSTERED 
(
	[id_residencia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_asignacion_pro]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_asignacion_pro](
	[id_pro_asig] [int] NOT NULL,
	[id_proyecto] [int] NULL,
	[fecha_comit] [date] NULL,
	[hora_comit] [date] NULL,
 CONSTRAINT [PK_t_asignacion_pro] PRIMARY KEY CLUSTERED 
(
	[id_pro_asig] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_avance]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_avance](
	[id_avance] [int] NOT NULL,
	[porcentaje] [int] NULL,
	[num_avance] [int] NULL,
	[id_proyecto] [int] NULL,
 CONSTRAINT [PK_t_avance] PRIMARY KEY CLUSTERED 
(
	[id_avance] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_checklist]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_checklist](
	[id_check] [int] NOT NULL,
	[fecha_comit] [date] NULL,
	[hora_comit] [date] NULL,
	[check] [int] NULL,
 CONSTRAINT [PK_t_checklist] PRIMARY KEY CLUSTERED 
(
	[id_check] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_desembolso]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_desembolso](
	[id_desembolso] [int] NOT NULL,
	[des_porciento] [int] NULL,
	[num_desembolso] [int] NULL,
	[id_proyecto] [int] NULL,
 CONSTRAINT [PK_t_desembolso] PRIMARY KEY CLUSTERED 
(
	[id_desembolso] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_direccion]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_direccion](
	[id_direccion] [nvarchar](50) NOT NULL,
	[descripcion] [nvarchar](max) NULL,
 CONSTRAINT [PK_t_direccion] PRIMARY KEY CLUSTERED 
(
	[id_direccion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_identificacion]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_identificacion](
	[Id_ident] [int] IDENTITY(1,1) NOT NULL,
	[nombreusuario] [nvarchar](50) NULL,
	[contraseña] [nvarchar](50) NULL,
	[mail] [nvarchar](50) NULL,
 CONSTRAINT [PK_t_identificacion] PRIMARY KEY CLUSTERED 
(
	[Id_ident] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_municipio]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_municipio](
	[id_municipio] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](50) NULL,
	[cod_postal] [int] NULL,
 CONSTRAINT [PK_t_municipio] PRIMARY KEY CLUSTERED 
(
	[id_municipio] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_proyecto]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_proyecto](
	[id_proyecto] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](50) NULL,
	[num_convenio] [int] NULL,
	[fecha_comit] [date] NULL,
	[descripcion] [nvarchar](max) NULL,
	[monto_total] [money] NULL,
	[id_municipio] [int] NULL,
	[id_check] [int] NULL,
	[fecha] [date] NULL,
	[estado] [int] NULL,
 CONSTRAINT [PK_t_proyecto] PRIMARY KEY CLUSTERED 
(
	[id_proyecto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_puesto]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_puesto](
	[id_puesto] [int] NOT NULL,
	[puesto] [nvarchar](max) NULL,
 CONSTRAINT [PK_t_puesto] PRIMARY KEY CLUSTERED 
(
	[id_puesto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[t_usuario]    Script Date: 17/09/2020 17:56:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[t_usuario](
	[id_usuario] [int] NOT NULL,
	[pnombre] [nvarchar](50) NULL,
	[snombre] [nvarchar](50) NULL,
	[tnombre] [nvarchar](50) NULL,
	[papellido] [nvarchar](50) NULL,
	[sapellido] [nvarchar](50) NULL,
	[id_residencia] [int] NULL,
	[id_puesto] [int] NULL,
	[id_pro_asig] [int] NULL,
	[fecha_sumit] [date] NULL,
	[Id_ident] [int] NULL,
 CONSTRAINT [PK_t_usuario] PRIMARY KEY CLUSTERED 
(
	[id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[t_identificacion] ON 

INSERT [dbo].[t_identificacion] ([Id_ident], [nombreusuario], [contraseña], [mail]) VALUES (1, N'kcordon', N'1234', N'kevcordon5@gmail.com')
SET IDENTITY_INSERT [dbo].[t_identificacion] OFF
GO
SET IDENTITY_INSERT [dbo].[t_municipio] ON 

INSERT [dbo].[t_municipio] ([id_municipio], [nombre], [cod_postal]) VALUES (1, N'Zacapa', 19001)
INSERT [dbo].[t_municipio] ([id_municipio], [nombre], [cod_postal]) VALUES (2, N'Estanzuela', 19002)
INSERT [dbo].[t_municipio] ([id_municipio], [nombre], [cod_postal]) VALUES (3, N'Rio Hondo', 19003)
INSERT [dbo].[t_municipio] ([id_municipio], [nombre], [cod_postal]) VALUES (4, NULL, 3)
SET IDENTITY_INSERT [dbo].[t_municipio] OFF
GO
SET IDENTITY_INSERT [dbo].[t_proyecto] ON 

INSERT [dbo].[t_proyecto] ([id_proyecto], [nombre], [num_convenio], [fecha_comit], [descripcion], [monto_total], [id_municipio], [id_check], [fecha], [estado]) VALUES (1, N'prueba', 123134, CAST(N'2020-09-16' AS Date), N'312131', 500000.0000, 1, NULL, NULL, 1)
INSERT [dbo].[t_proyecto] ([id_proyecto], [nombre], [num_convenio], [fecha_comit], [descripcion], [monto_total], [id_municipio], [id_check], [fecha], [estado]) VALUES (3, N'ACTUALIZA6', 2828, CAST(N'2020-09-16' AS Date), N'PRUEBAACTUALIZA', 100.0000, 1, NULL, CAST(N'2020-09-03' AS Date), 0)
INSERT [dbo].[t_proyecto] ([id_proyecto], [nombre], [num_convenio], [fecha_comit], [descripcion], [monto_total], [id_municipio], [id_check], [fecha], [estado]) VALUES (4, N'prueba', 12312, CAST(N'2020-09-17' AS Date), N'adfasf', 10000.0000, 2, NULL, CAST(N'2020-09-01' AS Date), 1)
SET IDENTITY_INSERT [dbo].[t_proyecto] OFF
GO
ALTER TABLE [dbo].[t_asignacion_pro] ADD  CONSTRAINT [DF_t_asignacion_pro_fecha_comit]  DEFAULT (getdate()) FOR [fecha_comit]
GO
ALTER TABLE [dbo].[t_asignacion_pro] ADD  CONSTRAINT [DF_t_asignacion_pro_hora_comit]  DEFAULT (getdate()) FOR [hora_comit]
GO
ALTER TABLE [dbo].[t_checklist] ADD  CONSTRAINT [DF_t_checklist_check]  DEFAULT ((1)) FOR [check]
GO
ALTER TABLE [dbo].[t_proyecto] ADD  CONSTRAINT [DF_t_proyecto_fecha_comit]  DEFAULT (getdate()) FOR [fecha_comit]
GO
ALTER TABLE [dbo].[t_proyecto] ADD  CONSTRAINT [DF_t_proyecto_estado]  DEFAULT ((1)) FOR [estado]
GO
ALTER TABLE [dbo].[t_usuario] ADD  CONSTRAINT [DF_t_usuario_fecha_sumit]  DEFAULT (getdate()) FOR [fecha_sumit]
GO
ALTER TABLE [dbo].[residencia]  WITH CHECK ADD  CONSTRAINT [FK_residencia_t_direccion] FOREIGN KEY([id_direccion])
REFERENCES [dbo].[t_direccion] ([id_direccion])
GO
ALTER TABLE [dbo].[residencia] CHECK CONSTRAINT [FK_residencia_t_direccion]
GO
ALTER TABLE [dbo].[residencia]  WITH CHECK ADD  CONSTRAINT [FK_residencia_t_municipio] FOREIGN KEY([id_municipio])
REFERENCES [dbo].[t_municipio] ([id_municipio])
GO
ALTER TABLE [dbo].[residencia] CHECK CONSTRAINT [FK_residencia_t_municipio]
GO
ALTER TABLE [dbo].[t_asignacion_pro]  WITH CHECK ADD  CONSTRAINT [FK_t_asignacion_pro_t_proyecto] FOREIGN KEY([id_proyecto])
REFERENCES [dbo].[t_proyecto] ([id_proyecto])
GO
ALTER TABLE [dbo].[t_asignacion_pro] CHECK CONSTRAINT [FK_t_asignacion_pro_t_proyecto]
GO
ALTER TABLE [dbo].[t_avance]  WITH CHECK ADD  CONSTRAINT [FK_t_avance_t_proyecto] FOREIGN KEY([id_proyecto])
REFERENCES [dbo].[t_proyecto] ([id_proyecto])
GO
ALTER TABLE [dbo].[t_avance] CHECK CONSTRAINT [FK_t_avance_t_proyecto]
GO
ALTER TABLE [dbo].[t_desembolso]  WITH CHECK ADD  CONSTRAINT [FK_t_desembolso_t_proyecto] FOREIGN KEY([id_proyecto])
REFERENCES [dbo].[t_proyecto] ([id_proyecto])
GO
ALTER TABLE [dbo].[t_desembolso] CHECK CONSTRAINT [FK_t_desembolso_t_proyecto]
GO
ALTER TABLE [dbo].[t_proyecto]  WITH CHECK ADD  CONSTRAINT [FK_t_proyecto_t_checklist] FOREIGN KEY([id_check])
REFERENCES [dbo].[t_checklist] ([id_check])
GO
ALTER TABLE [dbo].[t_proyecto] CHECK CONSTRAINT [FK_t_proyecto_t_checklist]
GO
ALTER TABLE [dbo].[t_proyecto]  WITH CHECK ADD  CONSTRAINT [FK_t_proyecto_t_municipio] FOREIGN KEY([id_municipio])
REFERENCES [dbo].[t_municipio] ([id_municipio])
GO
ALTER TABLE [dbo].[t_proyecto] CHECK CONSTRAINT [FK_t_proyecto_t_municipio]
GO
ALTER TABLE [dbo].[t_usuario]  WITH CHECK ADD  CONSTRAINT [FK_t_usuario_t_asignacion_pro] FOREIGN KEY([id_pro_asig])
REFERENCES [dbo].[t_asignacion_pro] ([id_pro_asig])
GO
ALTER TABLE [dbo].[t_usuario] CHECK CONSTRAINT [FK_t_usuario_t_asignacion_pro]
GO
ALTER TABLE [dbo].[t_usuario]  WITH CHECK ADD  CONSTRAINT [FK_t_usuario_t_identificacion] FOREIGN KEY([Id_ident])
REFERENCES [dbo].[t_identificacion] ([Id_ident])
GO
ALTER TABLE [dbo].[t_usuario] CHECK CONSTRAINT [FK_t_usuario_t_identificacion]
GO
ALTER TABLE [dbo].[t_usuario]  WITH CHECK ADD  CONSTRAINT [FK_t_usuario_t_puesto] FOREIGN KEY([id_puesto])
REFERENCES [dbo].[t_puesto] ([id_puesto])
GO
ALTER TABLE [dbo].[t_usuario] CHECK CONSTRAINT [FK_t_usuario_t_puesto]
GO
USE [master]
GO
ALTER DATABASE [bd_proyecto] SET  READ_WRITE 
GO
