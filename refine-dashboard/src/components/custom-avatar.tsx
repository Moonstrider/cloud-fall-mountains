import {Avatar as AntdAvatar, AvatarProps} from "antd";

type Props = AvatarProps & {
    name: string;
    style?: React.CSSProperties;
}

const CustomAvatar = ({name,style, ...rest}:Props) => {
    return (
        <AntdAvatar
            alt={'JavaScript Mastery'}
            size={40}
            style={{
                backgroundColor: '#87d068',
                display: 'flex',
                alignItems: 'center',
                border: 'none',

            }}
        >
            JM
        </AntdAvatar>
    )
}

export default CustomAvatar
