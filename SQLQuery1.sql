USE ValorantX;
GO

-- Listado de tablas
SELECT s.name AS SchemaName, t.name AS TableName
FROM sys.tables t
JOIN sys.schemas s ON t.schema_id = s.schema_id
ORDER BY SchemaName, TableName;
GO

-- Listado con recuento de filas
SELECT s.name AS SchemaName, t.name AS TableName,
       SUM(p.rows) AS RowCount
FROM sys.tables t
JOIN sys.schemas s ON t.schema_id = s.schema_id
LEFT JOIN sys.partitions p ON p.object_id = t.object_id AND p.index_id IN (0,1)
GROUP BY s.name, t.name
ORDER BY RowCount DESC;
GO

-- Previsualizar datos de la tabla Usuarios
SELECT TOP (100) * FROM dbo.Usuarios;
GO