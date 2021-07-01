package com.example.tournamentinfoandroidapp.model.dao

import com.example.tournamentinfoandroidapp.model.dto.User
import java.sql.Connection
import java.sql.DriverManager

class UserDAO {

    fun findAll(): ArrayList<User> {
        val list = ArrayList<User>()

        val con = createConnection()
        val ps = con.prepareStatement("")
        val rs = ps.executeQuery()

        while (rs.next()) {
            list.add(User(
                rs.getInt("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getInt("role_number"),
                rs.getString("role_name"),
                rs.getInt("login_status"),
                rs.getDate("create_time"),
                rs.getDate("update_time"),
                rs.getDate("last_login_time"),
                rs.getString("email"),
                rs.getString("full_name")
            ))
        }

        return list
    }

    companion object {
        private fun createConnection(): Connection {
            Class.forName("com.mysql.cj.jdbc.Driver")

            return DriverManager.getConnection("", "", "")
        }
    }
}