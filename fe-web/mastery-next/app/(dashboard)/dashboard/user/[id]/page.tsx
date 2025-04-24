import React from 'react';

export default async function UserDetailPage ({params}: { params: {id:string} }){
  const {id} = await params;
  return (
      <div>
        <h1 className="text-3xl">User {id}</h1>
      </div>
  );
};

// export default UserDetailPage;
