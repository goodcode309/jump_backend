//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String username;
    private String password;
    private static final long serialVersionUID = 1L;

    public User() {
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object that) {
        if (this == that) {
            return true;
        } else if (that == null) {
            return false;
        } else if (this.getClass() != that.getClass()) {
            return false;
        } else {
            boolean var10000;
            label57: {
                label49: {
                    User other = (User)that;
                    if (this.getUserId() == null) {
                        if (other.getUserId() != null) {
                            break label49;
                        }
                    } else if (!this.getUserId().equals(other.getUserId())) {
                        break label49;
                    }

                    if (this.getUsername() == null) {
                        if (other.getUsername() != null) {
                            break label49;
                        }
                    } else if (!this.getUsername().equals(other.getUsername())) {
                        break label49;
                    }

                    if (this.getPassword() == null) {
                        if (other.getPassword() == null) {
                            break label57;
                        }
                    } else if (this.getPassword().equals(other.getPassword())) {
                        break label57;
                    }
                }

                var10000 = false;
                return var10000;
            }

            var10000 = true;
            return var10000;
        }
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getUserId() == null ? 0 : this.getUserId().hashCode());
        result = 31 * result + (this.getUsername() == null ? 0 : this.getUsername().hashCode());
        result = 31 * result + (this.getPassword() == null ? 0 : this.getPassword().hashCode());
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(this.hashCode());
        sb.append(", userId=").append(this.userId);
        sb.append(", username=").append(this.username);
        sb.append(", password=").append(this.password);
        sb.append(", serialVersionUID=").append(1L);
        sb.append("]");
        return sb.toString();
    }
}
