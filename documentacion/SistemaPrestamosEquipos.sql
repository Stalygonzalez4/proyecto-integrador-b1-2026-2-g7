CREATE DATABASE SistemaPrestamosEquipos;
GO

USE SistemaPrestamosEquipos;
GO


CREATE TABLE Usuarios (
    IdUsuario INT IDENTITY(1,1) PRIMARY KEY,
    TipoDocumento VARCHAR(10),
    NumeroDocumento VARCHAR(20) UNIQUE,
    Nombres NVARCHAR(100),
    Apellidos NVARCHAR(100),
    Telefono VARCHAR(20),
    Correo NVARCHAR(150) UNIQUE,
    ContrasenaHash NVARCHAR(255),
    RolUsuario NVARCHAR(20) NOT NULL
        CHECK (RolUsuario IN ('Usuario', 'Administrador')),
    Activo BIT NOT NULL DEFAULT 1
);
GO

CREATE TABLE Equipos (
    IdEquipo INT IDENTITY(1,1) PRIMARY KEY,
    CodigoEquipo VARCHAR(30) UNIQUE NOT NULL,
    NombreEquipo NVARCHAR(100) NOT NULL,
    Descripcion NVARCHAR(250),
    Ubicacion NVARCHAR(100),
    Estado NVARCHAR(30) NOT NULL DEFAULT 'Disponible'
        CHECK (Estado IN ('Disponible', 'Prestado', 'Mantenimiento', 'Inactivo'))
);
GO

CREATE TABLE Prestamos (
    IdPrestamo INT IDENTITY(1,1) PRIMARY KEY,
    IdUsuario INT NOT NULL,
    IdEquipo INT NOT NULL,
    IdAdministrador INT NOT NULL,
    FechaPrestamo DATE NOT NULL,
    FechaDevolucionPrevista DATE NOT NULL,
    FechaDevolucionReal DATE,
    Estado NVARCHAR(20) NOT NULL DEFAULT 'Pendiente'
        CHECK (Estado IN ('Pendiente', 'Activo', 'Devuelto', 'Vencido', 'Cancelado')),

    FOREIGN KEY (IdUsuario)
        REFERENCES Usuarios(IdUsuario),

    FOREIGN KEY (IdEquipo)
        REFERENCES Equipos(IdEquipo),

    FOREIGN KEY (IdAdministrador)
        REFERENCES Usuarios(IdUsuario),

    CHECK (FechaDevolucionPrevista >= FechaPrestamo),

    CHECK (
        FechaDevolucionReal IS NULL
        OR FechaDevolucionReal >= FechaPrestamo
    )
);
GO