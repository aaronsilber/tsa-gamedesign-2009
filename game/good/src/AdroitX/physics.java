package AdroitX;

public class physics {
private static Boolean enabled = true;
private static Boolean collisionsEnabled = true;
private static Boolean gravityEnabled = true;
private static int gravityForce = 1;
public static void setEnabled(Boolean enabled) {
	physics.enabled = enabled;
}
public static Boolean getEnabled() {
	return enabled;
}
public static void setCollisionsEnabled(Boolean collisionsEnabled) {
	physics.collisionsEnabled = collisionsEnabled;
}
public static Boolean getCollisionsEnabled() {
	return collisionsEnabled;
}
public static void setGravityEnabled(Boolean gravityEnabled) {
	physics.gravityEnabled = gravityEnabled;
}
public static Boolean getGravityEnabled() {
	return gravityEnabled;
}
public static void setGravityForce(int gravityForce) {
	physics.gravityForce = gravityForce;
}
public static int getGravityForce() {
	return gravityForce;
}

public static void refreshPhysics()
{
	
}
}
