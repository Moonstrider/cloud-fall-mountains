import {Avatar as AntdAvatar, AvatarProps} from "antd";
import {getNameInitials} from "@/utilities";
import {moveLeftIn} from "antd/es/style/motion";

type Props = AvatarProps & {
    name?: string;
}

const CustomAvatar = ({name, style, ...rest}: Props) => {
    return (
        <AntdAvatar
            alt={name}
            size={40}
            style={{
                // marginLeft: 100,
                // marginTop: 100,
                backgroundColor: '#87d068',
                display: 'flex',
                alignItems: 'center',
                border: 'none',
                ...style,
            }}
            {...rest}
        >
            {getNameInitials(name || '')}
        </AntdAvatar>
    )
}

export default CustomAvatar
