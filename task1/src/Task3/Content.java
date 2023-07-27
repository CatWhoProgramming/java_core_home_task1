package Task3;

public class Content {
    private String content = "Harry Potter lives with his abusive aunt and uncle, \n " +
            "Vernon and Petunia Dursley, and their bullying son, Dudley. On Harry's eleventh birthday,\n" +
            " a half-giant named Rubeus Hagrid personally delivers an acceptance letter to Hogwarts School of Witchcraft \n" +
            "and Wizardry, revealing that Harry's parents, James and Lily Potter, were wizards. When Harry was one year old,\n" +
            " an evil and powerful dark wizard, Lord Voldemort, murdered his parents. Harry survived Voldemort's killing \n" +
            "curse that rebounded and seemingly destroyed the Dark Lord, leaving a lightning bolt-shaped scar on his forehead. Unknown to Harry,\n" +
            " this act made him famous in the wizarding world.";

   void show(){
       System.out.println(content);
   }

    public void setContent(String content) {
        this.content = content;
    }
}
