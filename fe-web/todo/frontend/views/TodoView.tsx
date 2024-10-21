import {useEffect, useState} from "react";
import Todo from "Frontend/generated/com/cloud/fall/mountains/todo/entity/Todo";
import {TodoEndpoint} from "Frontend/generated/endpoints";
import {TextField} from "@hilla/react-components/TextField";
import {Button} from "@hilla/react-components/Button";
import {Checkbox} from "@hilla/react-components/Checkbox";

export function TodoView() {

    const [todos, setTodos] = useState<Todo[]>([]);
    const [task, setTask] = useState<string>('');

    useEffect(() => {
        TodoEndpoint.findAll().then(setTodos);
    }, []);

    async function addTodo() {
        const saved = await TodoEndpoint.add(task)
        if (saved) {
            setTask('');
            setTodos([...todos, saved]);
        }
    }

    async function updateTodo(todo: Todo, done: boolean) {
        const updated = await TodoEndpoint.update(
            {...todo, done}
        );

        if (updated) {
            setTodos(todos.map(pre => pre.id === updated.id ? updated : pre));
        }
    }

    return (
        <div className="p-m">
            <h1>Hilla cool todo! Java + react ts</h1>

            <div className="flex gap-s">
                <TextField value={task} onChange={e => setTask(e.target.value)}/>
                <Button theme="primary" onClick={addTodo}>Add</Button>
            </div>

            {todos.map(todo => (
                <div key={todo.id}>
                    <Checkbox
                        checked={todo.done}
                        onCheckedChanged={e => updateTodo(todo, e.detail.value)}
                    />
                    <span>{todo.task}</span>
                </div>
            ))}

        </div>
    );
}