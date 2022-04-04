class Mammal {
  private int heartRate; 
  private int respirationRate; 
  private String bloodGroup; 

  static int eyes = 2;
  String foodType; 
  int chewTime; 
  //String heartRate;

  Mammal () { 
    System.out.println("I am an Animal");
  }

  public void setHeartRate (int heartRate) { 
    this.heartRate = heartRate; 
  }

  public void setRespirationRate (int respirationRate) { 
    this.respirationRate = respirationRate; 
  }

  public void setBloodGroup (String bloodGroup) { 
    this.bloodGroup = bloodGroup; 
  }

  int getHeartRate() {
    return heartRate;
  }

  int getRespirationRate() {
    return respirationRate;
  }
  
  String getBloodGroup() {
    return bloodGroup;
  } 

  public String eat_method (String foodType, String chewType, int chewTime) { 
   String response = "I eat "+ foodType+ " by " + chewType + "for "+ chewTime +" minutes";
   return response;
  }
  
}
