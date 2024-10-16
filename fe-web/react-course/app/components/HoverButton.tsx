import React, {useState} from "react";

// 定义按钮组件的 Props 类型
interface ButtonProps {
  icon: React.ReactNode;
}

// 按钮组件
const IconButton: React.FC<ButtonProps> = ({icon}) => {
  return (
      <button style={{padding: "10px", fontSize: "20px"}}>
        {icon}
      </button>
  );
};

// 方块组件
const HoverBlock: React.FC = () => {
  const [showButton, setShowButton] = useState(false);

  // 当鼠标移入时显示按钮
  const handleMouseEnter = () => {
    setShowButton(true);
  };

  // 当鼠标移出时隐藏按钮
  const handleMouseLeave = () => {
    setShowButton(false);
  };

  return (
      <div
          style={{
            width: "200px",
            height: "200px",
            border: "1px solid black",
            position: "relative",
            display: "flex",
            justifyContent: "center",
            alignItems: "center",
          }}
          onMouseEnter={handleMouseEnter}
          onMouseLeave={handleMouseLeave}
      >
        <span>Hover Me!</span>
        {showButton && (
            <div style={{position: "absolute", bottom: "10px", right: "10px"}}>
              <IconButton icon="🔍"/>
            </div>
        )}
      </div>
  );
};

const App: React.FC = () => {
  return (
      <div>
        <h1>鼠标悬停显示按钮</h1>
        <HoverBlock/>
      </div>
  );
};

export default App;