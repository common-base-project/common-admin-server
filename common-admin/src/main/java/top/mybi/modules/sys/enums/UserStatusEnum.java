

package top.mybi.modules.sys.enums;

/**
 * 用户状态
 *
 * @author Mustang mustang2247@gmail.com
 * @since 1.0.0
 */
public enum UserStatusEnum {
    DISABLE(0),
    ENABLED(1);

    private int value;

    UserStatusEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
