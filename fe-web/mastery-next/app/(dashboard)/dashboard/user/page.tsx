import React from 'react';
import Link from "next/link";

const UserPage = () => {
  return (
    <div>
      <h1>User Dashboard</h1>
      <ul>
        <li><Link href="/dashboard/user/1">User 1</Link></li>
        <li><Link href="/dashboard/user/2">User 2</Link></li>
        <li><Link href="/dashboard/user/3">User 3</Link></li>
      </ul>

    </div>
  );
};

export default UserPage;
