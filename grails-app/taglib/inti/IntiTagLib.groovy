package inti

import org.owasp.validator.html.AntiSamy
import org.owasp.validator.html.Policy

class IntiTagLib {
    static namespace = "inti"

    def chunk = {attrs, body->
        String text = "" << body()
        if(text.length() > 100){
          text = text.replaceAll("  ", " ")
          text = text.replaceAll("<p>", "")
          text = text.replaceAll("</p>", "")
          text = text.replaceAll("\n", "")
          text =  text.trim().substring(0,100) + " ..."
        }
        out << text.encodeAsHTML()
    }

}
