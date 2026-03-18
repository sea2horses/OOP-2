class CuentaBancaria(private val numeroCuenta: Int, private var saldo: Int = 0) {
    fun depositar(saldo_a_depositar: Int) {
        this.saldo += saldo_a_depositar
        println("Se depositaron $saldo_a_depositar cordobas.")
    }

    fun retirar(saldo_a_retirar: Int) {
        if(this.saldo < saldo_a_retirar) {
            println("No se puede retirar $saldo_a_retirar cordobas! (Saldo Insuficiente)")
            return
        }
        this.saldo -= saldo_a_retirar
        println("Se retiraron $saldo_a_retirar cordobas.")
    }

    fun consultarSaldo() {
        println("La cuenta posee $saldo cordobas.")
    }
}

fun main() {
    val cuenta = CuentaBancaria(12321)

    cuenta.depositar(500)
    cuenta.retirar(300)
    cuenta.retirar(300)
    cuenta.consultarSaldo()
}