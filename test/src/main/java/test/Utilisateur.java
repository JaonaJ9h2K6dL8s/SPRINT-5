package test;

import com.monframework.ModelView;
import com.monframework.Url;

public class Utilisateur {
        @Url("merci")
        public ModelView getMerciMonamie() {
            ModelView mv = new ModelView("/merci.jsp");
            mv.setData("message", "Merci mon amie ❤️");
            return mv;
        }

        @Url("bonjour")
        public ModelView direBonjour() {
            ModelView mv = new ModelView("/bonjour.jsp");
            mv.setData("texte", "Bonjour tout le monde ! 👋 Bienvenue sur notre framework.");
            return mv;
        }

        @Url("test")
        public ModelView methodeTest() {
            ModelView mv = new ModelView("/test.jsp");
            mv.setData("resultat", "Ceci est un test réussi ! ✅");
            return mv;
        }

        @Url("info")
        public ModelView getInfo() {
            ModelView mv = new ModelView("/info.jsp");
            mv.setData("framework", "MonFramework");
            mv.setData("date", new java.util.Date());
            mv.setData("utilisateur", "Testeur");
            return mv;
        }
}