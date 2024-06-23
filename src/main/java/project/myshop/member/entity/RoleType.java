package project.myshop.member.entity;

public enum RoleType {
    ROLE_USER("ROLE_USER"),
    ROLE_SELLER("ROLE_SELLER"),
    ROLE_ADMIN("ROLE_ADMIN");

    String role;

    RoleType(String role){
        this.role = role;
    }

    private String value(){
        return role;
    }
}
