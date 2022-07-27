package compil;



	public enum mot_clé {
		
		prog("programme"),
		debut("debut"),
		fin("fin"),
		si("si"),
		sinon("sinon"),
		alors("alors"),
		tq("tantque"),
		non("non"),
		et("et"),
		ou("ou"),
		var("var"),
		ent("entier"),
		reel("reel"),
		cnst("const"),
		faire("faire");
		 private final String nom;
		 private mot_clé (String nom ) {
	    	 this.nom=nom;
	     }
		
		 public String getnom() {
			 return nom;
		 }
		 
		
		
		

	}

