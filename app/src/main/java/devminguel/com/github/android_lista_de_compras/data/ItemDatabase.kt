package devminguel.com.github.android_lista_de_compras.data

import androidx.room.Database
import androidx.room.RoomDatabase
import devminguel.com.github.android_lista_de_compras.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    /**
     * Este método abstrato serve como um ponto de acesso para a classe DAO.
     * Quando este método é chamado, o Room irá gerar uma implementação.
     *
     * @return uma instância da classe DAO (ItemDao).
     */
    abstract fun itemDao(): ItemDao
}