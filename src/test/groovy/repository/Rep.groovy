package repository

import getl.lang.sub.SaveToRepository
import getl.lang.sub.RepositorySave

class Rep extends RepositorySave{

    static void main(def args) {
        Start(this, args)
    }

    @SaveToRepository(type = 'Files')
    def reg(){
        files('src1', true) {
            rootPath = "C:\\Users\\kugac\\Documents\\Документы\\EasyData\\ftp\\source"
        }

        files('dest1', true) {
            rootPath = "C:\\Users\\kugac\\Documents\\Документы\\EasyData\\ftp\\target"
        }
    }
}
