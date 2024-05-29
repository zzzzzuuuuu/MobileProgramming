package com.example.ch7_fileio

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FileUtil {

    fun readTextFile(fullPath: String): String {
        val file = File(fullPath)
        if (!file.exists()) return ""

        val reader = FileReader(fullPath)
        val buffer = BufferedReader(reader)

        var temp = ""
        val result = StringBuffer()

        while (true) {
            temp = buffer.readLine()
            if (temp == null) break
            else result.append(temp)
        }
        buffer.close()
        return result.toString()
    }

    fun writeTextFile() {}
}