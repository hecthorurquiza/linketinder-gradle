package linketinder

import groovy.sql.Sql
import linketinder.database.DatabaseConn

class App {
    static void main(String[] args) {
        Sql connection = DatabaseConn.newInstance()
        Menu menu = new Menu(connection)
        menu.showMenu()
    }
}
