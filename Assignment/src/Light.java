
class Light {
  public static void main(String[] args) {
    final int lightSpeed;
    final long days;
    final long seconds; 
    final long distance;
    lightSpeed = 186000;// approximate speed of light in miles per second
    days = 1000; // specify number of days here
    seconds = days * 24 * 60 * 60; // convert to seconds
    distance = lightSpeed * seconds; // compute distance
    log.fine("In " + days);
    log.fine(" days light will travel about ");
    log.fine(distance + " miles.");
  }
}
