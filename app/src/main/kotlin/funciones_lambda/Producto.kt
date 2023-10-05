package funciones_lambda

import javax.management.monitor.StringMonitor

enum class Estado {
    ACTIVO,
    INACTIVO
}
class Producto(
    var nombre: String,
    var precio: Float,
    var imagen: String,
    var caracteristicas: String,
    var estado: Estado = Estado.ACTIVO
)
class Categoria(
    var nombre: String,
    var estado: Estado = Estado.ACTIVO,
    var imagen: String,
    var producto: ArrayList<Producto> = ArrayList()
)