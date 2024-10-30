interface User {
  id: number;
  name: string;
  email: string;
}

export default async function UsersPage() {

  const res = await fetch('http://jsonplaceholder.typicode.com/users',
      // {cache: "no-store"}
      {next: {revalidate: 10}}// next.js will revalidate the data every 10 seconds
  );
  const users: User[] = await res.json();

  return (
      <>
        <h1>Users</h1>
        {/*this is static rendering, rendered at build time*/}
        <p>{new Date().toLocaleTimeString()}</p>
        {/*however dynamic rendering is rendered at request time*/}
        <table className='table table-bordered'>
          <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
          </tr>
          </thead>
          <tbody>
          {users.map(user => (
              <tr key={user.id}>
                <td>{user.name}</td>
                <td>{user.email}</td>
              </tr>
          ))}
          </tbody>
        </table>
      </>
  )
}