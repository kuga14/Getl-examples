package process

import groovy.transform.BaseScript
import getl.lang.Getl

@BaseScript Getl main

logFine 'Старт скрипта'
logWarn 'Приближение к финишу'
logInfo 'Финиш'

// Регистрация временных объетков в репозитории
files('#src', true) {
    rootPath = "C:\\Users\\kugac\\Documents\\Документы\\EasyData\\ftp\\source"
}

// Регистрация временных объетков в репозитории
files('#dest', true) {
    rootPath = "C:\\Users\\kugac\\Documents\\Документы\\EasyData\\ftp\\target"
}

// Список зарегистрированных объектов в репозитории
println("Repo objects: ")
listFilemanagers().forEach(str -> println(str))

// Удаление из репозитория
unregisterFilemanager('#src')

// Список зарегистрированных объектов в репозитории после удаления
println("Repo objects after unregister: ")
listFilemanagers().forEach(str -> println(str))

// Параметры из getl-propeties.conf
println("getl-propeties.conf: ")
options.getGetlConfigProperties().forEach((k,v)-> println("Key : " + k + " Value : " + v));

// Копирование файлов между источником и примеником, описанными в файле-репозитории
// Надо предварительно запустить сохранение в репозиторий GetlTestExamples\src\test\groovy\repository\Rep.groovy
fileman.copier(files('src1'), files('dest1')) {
    useSourcePath {
        mask = '*.*'
    }

    useDestinationPath {
        mask = ''
    }

    numberAttempts = 3
    timeAttempts = 1
}